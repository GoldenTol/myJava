package ch08_exception;

import java.util.Scanner;

public class ExcepTest02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("첫 번째 정수 입력 : ");
            int x = Integer.parseInt(scan.next());

            System.out.print("두 번째 정수 입력 : ");
            int y = Integer.parseInt(scan.next());
            System.out.println(x / y);

        } catch (NumberFormatException err) {
            System.out.println("숫자가 아닙니다.");
            System.out.println("예외 객체 정보 확인");
            System.out.println("메시지 : "+err.getMessage());
            System.out.println("문자열 : "+err.toString());
            err.printStackTrace();

        } catch (ArithmeticException err) {
            System.out.println("0으로 나누면 안 돼요.");
            System.out.println("예외 객체 정보 확인");
            System.out.println("메시지 : "+err.getMessage());
            System.out.println("문자열 : "+err.toString());
            err.printStackTrace();
            System.out.println();

        } catch (Exception err) {
            System.out.println("기타 나머지 예외 발생");
            System.out.println("예외 객체 정보 확인");
            System.out.println("메시지 : "+err.getMessage());
            System.out.println("문자열 : "+err.toString());
            err.printStackTrace();
            System.out.println();

        } finally {
            System.out.println("나는 무조건 실행이 됩니다.");
            scan.close();
            System.out.println();
        }
    }
}
