package ch01_variable_operator;

public class Operator01 {
    public static void main(String[] args) {
        int a=10;
        int b=8;

        boolean bool1=a!=b; //true
        boolean bool2=--a==b++; // false
        // a=9, b=8 → a=9, b=9
        boolean bool3=a++!=--b; //true
        //a=9, b=8 → a=10, b=8
        boolean bool4=bool3&&(5>7); //false
        // true && false
        boolean bool5=!bool4||(bool1&&bool2); //true
        // !false || (true && false) = true → !false || false → !false

        System.out.println("bool1 : "+bool1); //true
        System.out.println("bool2 : "+bool2); //false
        System.out.println("bool3 : "+bool3); //true
        System.out.println("bool4 : "+bool4); //false
        System.out.println("bool5 : "+bool5); //true
    }
}
