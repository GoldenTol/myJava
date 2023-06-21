package ch04_class;

import java.util.Scanner;

public class Saram04 {
    private String name;
    private double height;
    private double weight;
    private String hobby="당구";
    private String blood;

    private Scanner scan = null;

//    public 반환타입 메소드(매개변수){}
//      ↓      ↓       ↓     ↓
//    public  명시X   Saram04(){}
    public Saram04(){
        System.out.println("생성자 호출됨");
        this.name="철수";
        this.scan=new Scanner(System.in);
    }
    public Saram04(String name, double height, double weight, String hobby, String blood){
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.hobby=hobby;
        this.blood=blood;
    }
    public Saram04(String name, double height, double weight, String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.blood = blood;
        this.hobby = "퀼트";
    }
    public void Display(){
        System.out.println("이름 : "+this.name);
        System.out.println("키 : "+this.height);
        System.out.println("몸무게 : "+this.weight);
        System.out.println("취미 : "+this.hobby);
        System.out.println("혈액형 : "+this.blood);
    }
}
