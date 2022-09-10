package basics.ExceptionHandling;

public class WrongLoginException extends Exception {
    WrongLoginException() {
    }

    WrongLoginException(String message) {
        super(message);
    }
}
