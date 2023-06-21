package ch06_abstract_interface.carTest;

import java.util.Random;

public abstract class Car implements Speed, Display {
    private String name;
    private int price;
    // 모든 차에는 속도 개념이 있으므로 super에서 만듭니다.
    private int speed;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed += speed;
        if (this.speed >= Speed.ALLOWED_MAX_SPEED) {
            System.out.println(Speed.ALLOWED_MAX_SPEED + "이상 과속하지 마세요.");
            this.speed = Speed.ALLOWED_MAX_SPEED;
        }
    }

    public Car(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString () {
        String imsi = "이름 : " + this.name + "\n" + "단가 : " + this.price + "원\n";
        return imsi;
    }

}

