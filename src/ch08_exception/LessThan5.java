package ch08_exception;

public class LessThan5 extends Exception {
    private String message;

    public LessThan5(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return "내용 : "+this.message;
    }
}
