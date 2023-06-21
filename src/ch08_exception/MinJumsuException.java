package ch08_exception;

public class MinJumsuException extends Exception{
    private String message;

    public MinJumsuException(String message) {
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
