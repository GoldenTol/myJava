package ch05_package_inheritance.Nopolymorphism;

public class Tico {
    private String name; // 차량 이름
    private int price; // 가격
    private String comment; // 코멘트

    public Tico(String name, int price, String comment) { // 생성자
        this.name = name;
        this.price = price;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getComment() {
        return comment;
    }
}
