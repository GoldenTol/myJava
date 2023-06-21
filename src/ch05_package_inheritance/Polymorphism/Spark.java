package ch05_package_inheritance.Polymorphism;

public class Spark extends Car{
    private String maker; // 메이커

    public Spark(String name, int price, String maker) {
        super(name, price);
        this.maker=maker;
    }
    public String getMaker() {
        return maker;
    }
}
