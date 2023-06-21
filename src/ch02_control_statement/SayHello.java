package ch02_control_statement;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("인사말 멘트 : ");
        String hello = scan.next();

        System.out.println("반복할 횟수?");
        int many = scan.nextInt();

        for(int i = 1; i<(many+1); i++) {
            System.out.println(hello+ " "+i);
        }
        scan.close();
    }
}
