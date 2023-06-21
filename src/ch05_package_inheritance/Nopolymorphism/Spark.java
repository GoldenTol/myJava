package ch05_package_inheritance.Nopolymorphism;

public class Spark {
    private String name; // 차량 이름
    private int price; // 가격
    private String maker; // 메이커

    public Spark(String name, int price, String maker) {
        this.name = name;
        this.price = price;
        this.maker = maker;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getMaker() {
        return maker;
    }
}
