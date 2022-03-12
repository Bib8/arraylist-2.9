package ashdihomwork252arraylist;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "wrong name")
public class InvalidNameException extends RuntimeException {

    public InvalidNameException(String message) {
        super(message);
    }

    public InvalidNameException(String message, Throwable t) {
        super(message, t);
    }

    public InvalidNameException(Throwable t) {
        super(t);
    }
}
