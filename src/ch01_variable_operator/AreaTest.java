package ch01_variable_operator;

import java.sql.SQLOutput;

public class AreaTest {
    public static void main(String[] args) {
        double radius;
        double area;
        double pi;

        radius=10.0;
        pi=3.14;
        area=radius*radius*pi;

        System.out.println("반지름이 "+radius+"일 때 원의 면적은 "+area+"입니다.");

        String reasult="\n반지름이 ";
        reasult=reasult+radius;
        reasult=reasult+"일 때 원의 면적은 ";
        reasult=reasult+area;
        reasult=reasult+"입니다.";
        System.out.println(reasult);
    }
}
