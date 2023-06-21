package ch08_exception;

import java.util.Scanner;

public class EvenCheckMain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        EvenCheck error=null;

        try {
            System.out.println("정수 1개 입력 : ");
            int su=scan.nextInt();
            if (su%2 == 1) {
                String message="짝수를 입력하셔야 합니다.";
                error=new EvenCheck(message);
                throw error;
            } else {
                System.out.println("입력된 수는 ["+su+"]입니다.");
            }
        } catch (EvenCheck e){
            System.out.println("예외) 홀수가 입력되었습니다;");
            System.out.println("메시지 : "+e.getMessage());
            System.out.println("문자열 : "+e.toString());
            e.printStackTrace();
        }finally {
            scan.close();
        }
    }
}
