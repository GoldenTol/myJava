package ch05_package_inheritance.Polymorphism;

public class Cube extends Car{
    private double fuel; // 연비
    private String remark; // 연비 멘트

    public Cube(String name, int price, double fuel) {
        super(name, price);
        this.fuel=fuel;

        if(this.fuel>=20.0){
            this.remark="excellent";
        } else if (this.fuel>=15.0) {
            this.remark="good";
        } else {
            this.remark="poor";
        }
    }

    public double getFuel() {
        return fuel;
    }
    public String getRemark() {
        return remark;
    }
}
