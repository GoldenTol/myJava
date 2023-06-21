package ch08_exception;

import java.util.Scanner;

public class JumsuMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("응시자 입력 : ");
        String name = scan.next();
        System.out.print("국어 입력 : ");
        int kor = scan.nextInt();
        System.out.print("영어 입력 : ");
        int eng = scan.nextInt();
        System.out.print("수학 입력 : ");
        int math = scan.nextInt();
        int total = kor + eng + math;
        System.out.println("총점은 : " + total);
        double everage = (double) total / 3;
        System.out.println("평균은 : " + everage);

        if ((0 > kor || kor > 100) || (0 > eng || eng > 100) || (0 > math || math > 100))
            try {
                throw new Between1And100("시험 점수의 범위는 1이상 100이하 입니다.\n");
            } catch (Between1And100 err) {
                System.out.println(err.toString());
                System.out.println(err.getMessage());
                err.printStackTrace();

        } else if (kor<40) {
            String message=name+"님의 점수 "+kor+"은 평균이하의 점수입니다.\n";
            System.out.printf(message);
            try {
                throw new MinJumsuException (message);
            } catch (MinJumsuException err) {
                System.out.println(err.toString());
                System.out.println(err.getMessage());
                err.printStackTrace();
            }
        } else if (eng<40) {
            String message=name+"님의 점수 "+eng+"은 평균이하의 점수입니다.\n";
            System.out.printf(message);
            try {
                throw new MinJumsuException (message);
            } catch (MinJumsuException err) {
                System.out.println(err.toString());
                System.out.println(err.getMessage());
                err.printStackTrace();
            }
        }else if (math<40){
            String message=name+"님의 점수 "+math+"은 평균이하의 점수입니다.\n";
            System.out.printf(message);
            try {
                throw new MinJumsuException (message);
            } catch (MinJumsuException err) {
                System.out.println(err.toString());
                System.out.println(err.getMessage());
                err.printStackTrace();
            }
        } else if (kor+eng+math<180) {
            String message= "과락입니다.\n";
            try {
                throw new FailedException (message);
            } catch (FailedException err) {
                System.out.println(err.toString());
                System.out.println(err.getMessage());
                err.printStackTrace();
            }
        }
    }
}
