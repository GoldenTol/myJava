package ch06_abstract_interface.carTest;

import ch05_package_inheritance.Education.Student;

import java.util.Random;

public class CarTest {
    public static void main(String[] args) {
        Random rand=new Random(); // 랜덤 객체
        Car[] myCar={
                new Tico ("티코", 100, "작은차"),
                new Cube ("큐브", 200, 9.5)
        };

    for (int i = 0; i < myCar.length; i++) {
            System.out.println("==========");
            int val = rand.nextInt(20)+10;
            myCar[i].speedup(val); // 엑셀 밟기
            myCar[i].display();

            myCar[i].speedup(30); // 엑셀 밟기
            myCar[i].display();

            val=rand.nextInt(val)+10;
            myCar[i].speeddown(val); // 브레이크 밟기
            myCar[i].display();

            // System.out.println("toString() 메소드 오버라이딩");
            System.out.println(myCar[i]);
        }
    }
}
