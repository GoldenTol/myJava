package ch02_control_statement;

import java.util.Scanner;

public class SumOneToN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("임의의 정수 입력 : ");
        int su = scan.nextInt();

        int total = 0;
        for(int  i = 1; i < (su+1); i++) {
            total += i;
        }
        System.out.println("1부터 "+su+"까지의 합은 "+total+"입니다.");
    }
}
