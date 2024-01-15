package com.myblog.myblog14;

public class Login {
    private String UserName;
    private String Password;

    public Login(String userName, String password) {
        UserName = userName;
        Password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }
}
