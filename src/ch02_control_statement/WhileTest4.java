package ch02_control_statement;

import java.util.Scanner;

public class WhileTest4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int total=0;
        int count=0;
        double average=0;

        while(true){
            System.out.print("점수 입력 : ");
            int grade=scan.nextInt();

            if(grade>=-10){
                grade=Math.abs(grade);

            }else if(grade==0){
                System.out.printf("숫자 %d이(가) 입력되었습니다.\n", grade);
                System.out.println("프로그램을 종료합니다.");
                break;

            }else if(grade<-10){
                System.out.printf("숫자 %d이(가) 입력되었습니다.\n", grade);
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            total += grade;
            count++;
        }
        average = (double) total/count;
        System.out.println("\n총 시험 빈도(횟수) : "+count);
        System.out.println("총점 : "+total);
        System.out.printf("평균 : %.3f\n", average);
        System.out.println("\n");

        total=0;
        count=0;
        average=0;

        while(true){
            System.out.print("점수 입력 : ");
            int grade=scan.nextInt();

            if(grade < -10){
                System.out.printf("숫자 %d이(가) 입력되었습니다.\n", grade);
                System.out.println("프로그램을 종료합니다.");
                break;

            } else if(grade < 0){
                grade=Math.abs(grade);
            }else{ //후에 양수일 경우를 입력할 수 있게 자리를 남겨둠

            }
            total += grade;
            count++;
            average = (double) total/count;
        }
        System.out.println("\n총 시험 빈도(횟수) : "+count);
        System.out.println("총점 : "+total);
        System.out.printf("평균 : %.3f\n", average);
        scan.close();
    }
}