package Authorisation;

import java.util.regex.Pattern;

public class CredentialsValidator {
    public static boolean isCredentialsValid(UserCredentials userCredentials) {
        try {
            if (!Pattern.compile("^[\\w]+$").matcher(userCredentials.getLogin()).matches()) {
                throw new WrongCredentialException("invalid login");
            }
            if (!Pattern.compile("^[\\w]+$").matcher(userCredentials.getPassword()).matches()) {
                throw new WrongCredentialException("invalid password");
            }
        } catch (WrongCredentialException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static boolean isCredentialsValid(String login, String password) {
        try {
            if (!Pattern.compile("^[\\w]+$").matcher(login).matches()) {
                throw new WrongCredentialException("invalid login");
            }
            if (!Pattern.compile("^[\\w]+$").matcher(password).matches()) {
                throw new WrongCredentialException("invalid password");
            }
        } catch (WrongCredentialException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
