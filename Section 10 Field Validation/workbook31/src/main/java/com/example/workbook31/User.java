package com.example.workbook31;

import java.util.Date;

public class User {

    @NotBlank
    private String firstName;
    private String lastName;
    private String Username;
    private String Email;
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
