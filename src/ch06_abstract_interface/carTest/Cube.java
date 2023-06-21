package ch06_abstract_interface.carTest;

import java.util.Random;

public class Cube extends Car{
    private double fuel;

    public Cube(String name, int price, double fuel) {
        super(name, price);
        this.fuel=fuel;
    }
    @Override
    public String toString() {
        String imsi="연비 : " + this.fuel+"\n";
        return super.toString()+imsi;
    }
    @Override
    public void display() {
        String imsi ="%s의 현재 속도는 %dkm 입니다.\n";
        double speed=(double) super.getSpeed()/1.6;
        System.out.printf(imsi, super.getName(), super.getSpeed());
    }

    @Override
    public void speedup(int su) {
        super.setSpeed(+su);
    }

    @Override
    public void speeddown(int su) {
        super.setSpeed(-su);
    }
}
