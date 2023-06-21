package ch05_package_inheritance.Polymorphism;

public class Tico extends Car{
    //super() ← 1. 숨겨져 있는 매개 변수 없는 생성자
    private String comment; //코멘트

    public Tico(String name, int price, String comment) {
        super(name, price);
        this.comment = comment;
    }
    public String getComment() {
        return comment;
    }
}
