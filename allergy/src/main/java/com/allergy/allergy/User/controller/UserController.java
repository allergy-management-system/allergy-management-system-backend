package com.allergy.allergy.User.controller;


import com.allergy.allergy.User.service.UserService;
import com.allergy.allergy.User.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    //<--Define the GET endpoint to retrieve all users
    @GetMapping(path = "/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    //<--Define the POST endpoint to ADD a new user
    @PostMapping("/addNewUser")
    public ResponseEntity<User> registerNewUser(@RequestBody User user) {
        return userService.registerNewUser(user);
    }

    //<--Login the user into his or her account
    @PostMapping(path = "loginUser")
    public ResponseEntity<User> loginUser(String email, String password) {
        return userService.loginUser(email, password);
    }

    //<--Define the DELETE endpoint to delete a user account
    @DeleteMapping(path = "/deleteUser/{userId}")
    public void deleteUserAccount(@PathVariable("userId") String userId) {
        userService.deleteUserAccount(userId);
    }

    @DeleteMapping(path = "/deleteAllUsers")
    public void deleteAllUsers() {
        userService.deleteAllUsers();
    }

    //<--Define the PUT endpoint for updating user details
    @PutMapping(path = "updateUser/{userId}")
    public void updateUserDetails(
            @PathVariable("userId") String userId,
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName
    ){
        userService.updateUserDetails(userId, firstName, lastName);
    }
}
