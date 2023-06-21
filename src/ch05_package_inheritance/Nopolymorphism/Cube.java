package ch05_package_inheritance.Nopolymorphism;

public class Cube {
    private String name; // 차량 이름
    private int price; // 가격
    private double fuel; // 연비
    private String fuelComment; // 연비 멘트

    public Cube(String name, int price, double fuel) {
        this.name = name;
        this.price = price;
        this.fuel = fuel;

        if (this.fuel >= 20){
                this.fuelComment="excellent";
        } else if (this.fuel >= 15) {
                this.fuelComment="good";
        }else{
                this.fuelComment="poor";
        }
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public double getFuel() {
        return fuel;
    }
    public String getFuelComment() {
        return fuelComment;
    }
}
