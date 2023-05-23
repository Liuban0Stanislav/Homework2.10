package sky.pro.homework2_9.execptions;

public class IsMixedCaseException extends RuntimeException{
    public IsMixedCaseException() {
    }

    public IsMixedCaseException(String message) {
        super(message);
    }
}
