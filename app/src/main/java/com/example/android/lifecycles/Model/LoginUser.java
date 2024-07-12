package com.example.android.lifecycles.Model;

import android.util.Patterns;


public class LoginUser {

    private String strUsername;
    private String strPassword;

    public LoginUser(String Username, String Password) {
        strUsername = Username;
        strPassword = Password;
    }

    public String getStrUsername() {
        return strUsername;
    }

    public String getStrPassword() {
        return strPassword;
    }


    public boolean isPasswordLengthGreaterThan5() {
        return getStrPassword().length() > 5;
    }

}