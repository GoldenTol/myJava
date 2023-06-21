package ch07_utility_classes.classex;

import java.util.Scanner;

public class ClassMain01 {
    public static void main(String[] args) {
        Human person=new Human();
        Class class01=person.getClass();
        System.out.println("Object.getClass()메소드로 클래스 정보 읽기");
        System.out.println(class01.getName());

        System.out.println("Direct class 할당");
        Class class02=Human.class;
        System.out.println(class02.getName());

        Scanner scan=new Scanner(System.in);
        System.out.println("클래스 선택 : Human(1), Sport(2) : ");
        int menu= scan.nextInt();
        String className=null;

        if(menu==1){
            className="ch07_utility_classes.classex.Human";
        }else if(menu==2){
            className="ch07_utility_classes.classex.Sport";
        }else{
            className="";
        }

        Class class03=null;
        try {
            System.out.println("Class.forName() 메소드를 이용한 동적 객체 생성");
            class03=Class.forName(className);
            System.out.println(class03.getName());

        } catch (ClassNotFoundException e) {
            System.out.println(className+"은(는) 존재하지 않는 클래스입니다.");
            e.printStackTrace();
        }
    }
}
