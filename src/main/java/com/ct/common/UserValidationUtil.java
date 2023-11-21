package com.ct.common;

public class UserValidationUtil {

    public static void validateUser(Creatable user) {
        if (user == null) {
            throw new RuntimeException("user create request is null");
        }

        if (user.getName() == null
                || user.getName().isBlank()) {
            throw new RuntimeException("user name was not provided");
        }

        if (user.getPassword() == null
                || user.getPassword().isBlank()) {
            throw new RuntimeException("password was not provided");
        }

        //validate age

    }
}
