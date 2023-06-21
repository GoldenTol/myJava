package ch02_control_statement;
import  java.util.Random;
import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int total=0;
        int count=0;
        double average=0;

        while(true){
            System.out.print("점수 입력 : ");
            int grade=scan.nextInt();

            if(grade==0){
                System.out.println("0이어서 종료합니다.");
                break;
            }else if(grade<0){
                System.out.println("음수이어서 종료합니다.");
                break;
            }
            total += grade;
            count +=1;
            average = (double) total/count;
        }
        System.out.println("총 시험 빈도(횟수) : "+count);
        System.out.println("총점 : "+total);
        System.out.printf("평균 : %.3f\n", average);

        scan.close();
    }
}

