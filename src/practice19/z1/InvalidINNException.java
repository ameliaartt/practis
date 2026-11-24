package practice19.z1;

public class InvalidINNException extends RuntimeException {
    public InvalidINNException(String message) {
        super(message);
    }

    public InvalidINNException(String message, Throwable cause) {
        super(message, cause);
    }
}
