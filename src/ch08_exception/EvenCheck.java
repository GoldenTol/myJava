package ch08_exception;

public class EvenCheck extends Exception {
    private String message;

    public EvenCheck(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return "내용 : "+this.message;
    }
}
