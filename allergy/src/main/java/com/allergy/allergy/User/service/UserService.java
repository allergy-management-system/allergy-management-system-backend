package com.allergy.allergy.User.service;

import com.allergy.allergy.User.model.User;
import com.allergy.allergy.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    //<--Initialise the User repository as a private final field...
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //<--Get all the users from the database...
    public List<User> getAllUsers() {
        System.out.println(userRepository.findAll());
        return userRepository.findAll();
    }

    //<--Register a new user...
    //<--Write a condition to check if the user email is already existing in the database
    public ResponseEntity<User> registerNewUser(User user) {
        Optional<User> existingUser = userRepository.findUserByEmail(user.getEmail());
        if (existingUser.isPresent()) {
            throw new IllegalStateException("User " + user.getEmail() + " already exists.");
        } else {
            User newUser = userRepository.save(user);
            return ResponseEntity.ok(newUser);
        }
    }

    //<--Login single user
    public ResponseEntity<User> loginUser(String email, String password) {
        User user = userRepository.findUserByEmailAndPassword(email, password)
                .orElseThrow(() -> new IllegalStateException("Email or password not found"));
        System.out.println(user.getEmail() + " and " + user.getPassword());
        return ResponseEntity.ok(user);
    }

    //<--Delete user
    //<--Write a condition to check if the user exists before you initiate the  request
    public void deleteUserAccount(String userId) {
        boolean exists = userRepository.existsById(userId);
        if (!exists) {
            throw new IllegalStateException("User with id " + userId + " does not exist.");
        }
        userRepository.deleteById(userId);
    }

    //<--Update user details
    @Transactional
    public void updateUserDetails(String userId, String firstName, String lastName) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalStateException("The user does not exist"));
        if (!firstName.isEmpty() && !firstName.equals(user.getFirstName())) {
            user.setFirstName(firstName);
        }
        if (!lastName.isEmpty() && !lastName.equals(user.getFirstName())) {
            user.setLastName(lastName);
        }
        userRepository.save(user);
    }

    //<--Delete all the users
    public void deleteAllUsers() {
        final List<User> user = userRepository.findAll();
        userRepository.deleteAll(user);
    }

}
