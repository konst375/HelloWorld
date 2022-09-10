package basics.ExceptionHandling;

import java.util.regex.Pattern;

public class CredentialsValidator {
    private static final int MAX_LOGIN_LENGTH = 20;
    private static final int MAX_PASSWORD_LENGTH = 20;

    public static boolean isLoginValid(String login) {
        try {
            if (!Pattern.compile("^[\\w]+$").matcher(login).matches()) {
                throw new WrongLoginException("invalid login: login must consist of english symbols, numbers and underscores");
            } else if (login.length() >= MAX_LOGIN_LENGTH) {
                throw new WrongLoginException("invalid login: login must be less than 20");
            }
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static boolean isPasswordValid(String password, String confirmPassword) {
        try {
            if (!Pattern.compile("^[\\w]+$").matcher(password).matches()) {
                throw new WrongPasswordException("invalid password: password must consist of english symbols, numbers and underscores");
            } else if (password.length() >= MAX_PASSWORD_LENGTH) {
                throw new WrongPasswordException("invalid password: password must be less than 20");
            } else if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("invalid password: passwords don't match");
            }
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
