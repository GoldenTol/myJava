package Yunie;

import java.util.Scanner;

public class munJe0103 {
    // 성적을 입력했을 때 학점을 출력해주는 프로그램
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 0;
        int count = 0;
        double average = 0;

        while (true) {
            System.out.println("A과목 성적을 입력하세요.");
            int scoreA = scan.nextInt();
            count++;
            System.out.println("B과목 성적을 입력하세요.");
            int scoreB = scan.nextInt();
            count++;

            if (scoreA >= 90) {
                System.out.println("학점: A");
            } else if (scoreA >= 80) {
                System.out.println("학점: B");
            } else if (scoreA >= 70) {
                System.out.println("학점: C");
            } else if (scoreA >= 60) {
                System.out.println("학점: D");
            } else  {
                System.out.println("학점: F");
            }
            if (scoreB >= 90) {
                System.out.println("학점: A");
                break;
            } else if (scoreB >= 80) {
                System.out.println("학점: B");
                break;
            } else if (scoreB >= 70) {
                System.out.println("학점: C");
                break;
            } else if (scoreB >= 60) {
                System.out.println("학점: D");
                break;
            } else {
                System.out.println("학점: F");
                break;
            }
            /*total = scoreA + scoreB;
            average = (double) total / count;
            System.out.println("\n");
             */
        }
        System.out.println("\n시험과목 수 : "+count);
        System.out.println("총점 : "+total);
        System.out.printf("평균 : %.3f\n", average);
        scan.close();
    }
}