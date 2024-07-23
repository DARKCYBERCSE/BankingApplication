package com.banking.util;

import java.security.SecureRandom;
import java.util.Base64;

public class PasswordUtil {
    public static String generateRandomPassword() {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[16];
        random.nextBytes(bytes);
        return Base64.getEncoder().encodeToString(bytes);
    }
}
