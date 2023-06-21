package ch01_variable_operator;

public class PlusMinus01 {
    public static void main(String[] args) {
        int a=10, b=20, c;
        c=++a+b++;

        System.out.println("a : "+a); // 11
        System.out.println("b : "+b); // 21
        System.out.println("c : "+c); // 31
        System.out.println("\n");

        c=a++ + --b;

        System.out.println("\n");
        System.out.println("a : "+a); // 12
        System.out.println("b : "+b); // 20
        System.out.println("c : "+c); // 31
        System.out.println("\n");

        a=15;
        b=12;
        c=--a+--b;

        System.out.println("a : "+a); // 14
        System.out.println("b : "+b); // 11
        System.out.println("c : "+c); // 25
        System.out.println("\n");

        int x=3, y=5,z;
        z=x++ + --y;

        System.out.println("x : "+x); // 4
        System.out.println("y : "+y); // 4
        System.out.println("z : "+z); // 7
        System.out.println("\n");

        z+=--x + y++; // z = z + --x + y++ → 실행순서는 4 2 1 3 5

        System.out.println("x : "+x); // 3
        System.out.println("y : "+y); // 5
        System.out.println("z : "+z); // 14

    }
}
