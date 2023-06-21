package ch06_abstract_interface.carTest;

import java.util.Random;

public class Tico extends Car{
    String comment;

    public Tico(String name, int price, String comment) {
        super(name, price);
        this.comment=comment;
    }
    @Override
    public String toString() {
        String imsi="코멘트 : "+this.comment+"\n";
        return super.toString()+imsi;
    }
    @Override
    public void display() {
        String imsi ="%s의 현재 속도는 %dkm 입니다.\n";
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
