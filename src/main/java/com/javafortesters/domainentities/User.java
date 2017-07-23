package com.javafortesters.domainentities;

/**
 * Created by vgolikov on 17-Apr-17.
 */
public class User {
    private String username;
    private String password;

    public User() {
        this("username", "password");
    }

    public User(String username, String password) {
        this.username = username;
        setPassword(password);
    }

    public void setPassword(String password) {

        if (password.length() < 7) {
            throw new IllegalArgumentException("Password must be longer than 6 chars");
        }
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
