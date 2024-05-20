package com.util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginValidation {
	public static boolean validateInput(String input, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        return m.matches();
    }
    public static boolean isValidPassword(String password) {
        
        String pattern = "^(?=.*[A-Za-z])(?=.*\\d).{8,}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(password);
        return matcher.matches();
    }
    public static boolean isValidUsername(String username) {
    	String pattern = "^[a-zA-Z0-5]{10}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(username);
        return matcher.matches();
    }
}
