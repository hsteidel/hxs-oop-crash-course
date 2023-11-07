package com.ct.common;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class PasswordUtils {


    public static String encryptPassword(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes(StandardCharsets.UTF_8));
    }

}
