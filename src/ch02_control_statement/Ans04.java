package ch02_control_statement;

import java.util.Scanner;

public class Ans04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("이름 입력 : ");
        String name = scan.next();
        System.out.println("국어 점수 입력 : ");
        double lanSc = scan.nextDouble();
        System.out.println("영어 점수 입력 : ");
        double engSc = scan.nextDouble();
        System.out.println("수학 점수 입력 : ");
        double matSc = scan.nextDouble();


        double total = lanSc+engSc+matSc;
        double average = total/3;
        System.out.println("\n");

        System.out.println("응시자 이름 : "+name);
        System.out.println("국어 점수 입력 : "+lanSc);
        System.out.println("영어 점수 입력 : "+engSc);
        System.out.println("수학 점수 입력 : "+matSc);
        System.out.printf("총점 : "+total);
        System.out.printf("\n평균 : "+average);
        System.out.println("\n");

        System.out.printf("이름 : %s\n", name);
        System.out.printf("국어 : %.2f\n", lanSc);
        System.out.printf("영어 : %.2f\n", engSc);
        System.out.printf("수학 : %.2f\n", matSc);
        System.out.printf("총점 : %.2f\n", total);
        System.out.printf("평균 : %d\n", (int)average);
    }
}
