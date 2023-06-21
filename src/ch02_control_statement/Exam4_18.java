package ch02_control_statement;

import java.util.Scanner;

public class Exam4_18 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("임의의 정수 입력");
        int su= scan.nextInt();

        int total=0;
        int i=1;
        while(i<=su){
            total=i*i;
            i+=1;
            System.out.println(i+"의 제곱은 "+(i*i)+"입니다.");
        }
        scan.close();

        System.out.println("\n");
        total=0;
        for(i=1; i<=su; i++){
            total=i*i;
            System.out.println(i+"의 제곱은 "+total+"입니다.");
        }
    }
}
