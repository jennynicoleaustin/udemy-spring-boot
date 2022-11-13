package com.example.workbook31;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

public class User {
    @NotBlank(message = "First name cannot be blank")
    @Size(min = 2, message = "First name must be longer than two characters")
    private String firstName;

    @NotBlank(message = "Last name cannot be blank")
    @Size(min = 2, message = "Last name must be longer than two characters")

    private String lastName;
    @NotBlank(message = "Username cannot be blank")
    @Size(message = "Username must be at least 7 characters long")
    private String Username;
    @Email
    private String Email;
    @Past
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Age(message = "You must be 18")
    private Date birthDate;

    public User(String firstName, String lastName, String username, String email, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        Username = username;
        Email = email;
        this.birthDate = birthDate;
    }

    public User() {
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

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
