package Assignment;

public class InvalidEmailException extends IllegalArgumentException {
    InvalidEmailException(String message) {
        super(message);
    }
}
