package ch08_exception;

public class FailedException extends Throwable {
    private String message;

    public FailedException(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "문자열 : "+this.message;
    }
    @Override
    public String getMessage() {
        return "메시지 : "+this.message;
    }
}
