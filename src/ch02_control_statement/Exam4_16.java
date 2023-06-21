package ch02_control_statement;

import java.util.Scanner;

public class Exam4_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("별 출력 개수 입력");
        int star = scan.nextInt();

        System.out.println("for 구문");
        int i = 1;
        for (i = 1; i <= star; i++) {
            System.out.print("*");

            if (i % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
        System.out.println("while 구문");
        i = 1;
        while (i <= star) {
            System.out.print("*");
            if (i % 5 == 0) {
                System.out.println();
            }
            i++;
        }

        System.out.println("\n");
        System.out.println("별 출력 개수 입력");
        star = scan.nextInt();
        System.out.println("한 줄에 출력 개수");
        int oneline = scan.nextInt();

        System.out.println("for 구문");
        i = 1;
        for (i = 1; i <= star; i++) {
            System.out.print("*");

            if (i % oneline == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
        System.out.println("while 구문");
        i = 1;
        while (i <= star) {
            System.out.print("*");
            if (i % oneline == 0) {
                System.out.println();
            }
            i++;
        }
        scan.close();
    }
}
