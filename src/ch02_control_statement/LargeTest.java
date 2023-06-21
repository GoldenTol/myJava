package ch02_control_statement;

import java.util.Scanner;

public class LargeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1번째 정수 입력 : ");
        int illben = scan.nextInt();

        System.out.println("2번째 정수 입력 : ");
        int eben = scan.nextInt();
        System.out.println("\n");

        System.out.println("1번째 정수 : "+illben);
        System.out.println("2번째 정수 : "+eben);
        System.out.println("\n");

        if(illben>eben) {
            System.out.println("1번째 정수가 더 큽니다.");
            System.out.println("큰 수 : "+illben);
        }else {
            System.out.println("2번째 정수가 더 큽니다.");
            System.out.println("큰 수 : "+eben);
        }
        scan.close();
    }
}
