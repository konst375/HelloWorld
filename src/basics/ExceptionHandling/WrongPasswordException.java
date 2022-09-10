package basics.ExceptionHandling;

public class WrongPasswordException extends Exception {

    WrongPasswordException() {
        super();
    }

    WrongPasswordException(String message) {
        super(message);
    }
}
