package Authorisation;

public class WrongCredentialException extends Exception {
    public WrongCredentialException(String message) {
        super(message);
    }
}
