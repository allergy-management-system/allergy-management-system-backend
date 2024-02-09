package com.allergy.allergy.User;

import org.springframework.beans.factory.annotation.Autowired;
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
        return userRepository.findAll();
    }

    //<--Register a new user...
    //<--Write a condition to check if the user email is already existing in the database
    public void registerNewUser(User user) {
        Optional<User> existingUser = userRepository.findUserByEmail( user.getEmail() );
        if (existingUser.isPresent()) throw new IllegalStateException("User " + user.getEmail() + "already exists.");
        userRepository.save(user);
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

    //<--Login single user
    public void logInUser(String email, String password) {
        Optional<User> userEmailAndPasswordExists = userRepository.findUserByEmailAndPassword(email, password);
        if (userEmailAndPasswordExists.isPresent()) {

        }
        throw new IllegalStateException("incorrect email or password");
    }

    //<--Retrieve a logged in user's details
    public void getLoggedInUserDetails(String email) {

    }
}
