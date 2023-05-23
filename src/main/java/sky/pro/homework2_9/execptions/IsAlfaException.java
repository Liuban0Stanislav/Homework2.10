package sky.pro.homework2_9.execptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IsAlfaException extends RuntimeException{
    public IsAlfaException() {
    }
    public IsAlfaException(String message) {
        super(message);
    }
}
