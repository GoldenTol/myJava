package ch03_array;

import java.util.Scanner;

public class StuduntExam {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("이름 입력 : ");
        String name= scan.next();

        double total=0, average=0;
        int[] jumsu = new int[3];
        for (int i=0; i< jumsu.length; i++){
            System.out.printf((i+1)+"번째 점수 : ");
            jumsu[i]= scan.nextInt();
            total += jumsu[i];
        }
        average = total/3;
        System.out.printf("\n학생의 정보");
        System.out.printf("\n이름 : "+name);
        System.out.printf("\n총점 : %.2f", total);
        System.out.printf("\n평균 : %.2f", average);

        System.out.print("\n\n이름 입력 : ");
        String name2=scan.next();

        String[]su = new String[3];
        su[0]="국어";
        su[1]="영어";
        su[2]="수학";

        total=0;
        average=0;
        for (int i=0; i<jumsu.length; i++){
            System.out.print(su[i]+" 점수 입력 : ");
            int suja = scan.nextInt();
            total += suja;
        }
        average = total/3;
        System.out.printf("\n학생의 정보");
        System.out.printf("\n이름 : "+name);
        System.out.printf("\n총점 : %.2f", total);
        System.out.printf("\n평균 : %.2f", average);
    }
}
