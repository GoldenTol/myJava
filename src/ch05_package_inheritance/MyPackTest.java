package ch05_package_inheritance;

import mypackage.MyPackOne; // 다른 패키지에 있는 클래스 참조
import mypackage.*; // *은 all classes 해당 패키지 안의 모든 클래스
import java.lang.System;

import java.util.Scanner;

public class MyPackTest {
    public static void main(String[] args) {
        MyPackOne obj1=new MyPackOne();

        obj1.setData(1234);
        System.out.println(obj1.getData());
        obj1.one();

        MyPackTwo two=new MyPackTwo();
        two.two();

        Scanner scan=new Scanner(System.in);
    }
}
