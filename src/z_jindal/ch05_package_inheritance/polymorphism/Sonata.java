package z_jindal.ch05_package_inheritance.polymorphism;

public class Sonata extends Car{

    private String maker ; // 제조 회사

    public Sonata(String name, int price, String maker) {
        super(name, price);
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }
}
