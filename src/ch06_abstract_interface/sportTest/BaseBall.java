package ch06_abstract_interface.sportTest;

public class BaseBall extends Sport{
    private double hitrate;
    private String comment;

    public BaseBall(String name, int entry, double hitrate, String comment) {
        super(name, entry);
        this.hitrate=hitrate;
        this.comment=comment;
        this.message();
    }
    @Override
    public void Display() {
    }
    public void message() {
        super.Display2();
        System.out.println("타율 : " + this.hitrate);
        System.out.println("평가 : " + this.comment);
    }
}
