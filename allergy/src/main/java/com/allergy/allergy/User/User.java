package com.allergy.allergy.User;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class User {

    @Id
    private String userId;
    @Field
    private String firstName;
    @Field
    private String lastName;
    @Field
    private String dateOfBirth;
    @Field
    private String gender;
    @Field
    private String email;
    @Field
    private String password;


    public User() {

    }

    public User(String firstName, String lastName, String dateOfBirth, String gender, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth =dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format(
                "User[" +
                        "userId='$s', " +
                        "firstName='%s', " +
                        "lastName='%s', " +
                        "dateOfBirth='%s'",
                        "gender='%s', " +
                        "email='%s', " +
                        "password='%s', " +
                userId, firstName, lastName, dateOfBirth, gender, email, password );
    }
}
