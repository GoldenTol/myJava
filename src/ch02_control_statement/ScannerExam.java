package ch02_control_statement;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        // scan은 바코드 스캐너 장비의 이름 (객체)
        Scanner scan = new Scanner(System.in); //키보드

        System.out.println("이름 입력해주세요 : ");
        String name = scan.next();

        System.out.println("나이 입력해주세요 : ");
        int age = scan.nextInt();

        System.out.println("이름 : " +  name); // 모니터
        System.out.println("나이 : " +  age); // 모니터

        scan.close(); // 장치 닫기
    }
}
