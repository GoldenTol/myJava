package ch08_exception;

import java.util.Scanner;

public class LessThan5Test {
    public static void main(String[] args) {
        int x=3;
        LessThan5 error=null;

        try {
            if (x < 5) {
                String message="5이상의 정수를 입력하셔야 합니다.";
                error=new LessThan5(message);
                throw error;
                // 예외처리
            } else {
                System.out.println("프로그램 정상");
            }
        } catch (LessThan5 e){
            System.out.println("예외) 5미만의 숫자가 입력되었습니다.");
            System.out.println("메시지 : "+e.getMessage());
            System.out.println("문자열 : "+e.toString());
            e.printStackTrace();
        }
    }
}
