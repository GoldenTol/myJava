package ch03_array;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("배열 요소 개수 입력 : ");
        int size= scan.nextInt();
        System.out.printf("\n");

        int odd=0, even=0;
        int[]jumsu=new int[size];
        for (int i=0; i<jumsu.length; i++){
            System.out.printf((i+1)+"번째 수 입력 : ");
            jumsu[i]= scan.nextInt();

            if(jumsu[i]%2 == 0){
               even += jumsu[i];
            }else{
               odd += jumsu[i];
            }
        }
        System.out.printf("\n");
        System.out.print("홀수의 총합 :"+odd);
        System.out.printf("\n");
        System.out.print("짝수의 총합 :"+even);
        scan.close();
    }
}
