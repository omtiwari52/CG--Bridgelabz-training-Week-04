package com.capgemini.junit_problems.password_validator;

import java.util.regex.Pattern;

public class PasswordValidator {

    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*\\d).{8,}$";

    private static final Pattern pattern = Pattern.compile(PASSWORD_REGEX);

    // Method to validate password
    public static boolean isValidPassword(String password) {
        if (password == null) return false;
        return pattern.matcher(password).matches();
    }
}
