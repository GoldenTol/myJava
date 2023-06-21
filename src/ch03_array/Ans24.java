package ch03_array;

import java.util.Scanner;

public class Ans24 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("배열 크기 입력 : ");
        int size = scan.nextInt();

        double[]score=new double[size];

        double total=0.0;
        double average=0.0;

        for(int i=0; i<score.length; i++){
            System.out.println((i+1)+"번째 요소 값 입력 : ");
            score[i]=scan.nextDouble();
            total += score[i];
            // i값이 변할 때 마다 누적해서 계산해야하기 때문에 for구문 안에서 계산
        }
        average=total/size;
        // 누적 계산이 다 끝난 후에 한 번만 계산하면 되기에 for구문 밖에서 계산
        System.out.printf("총합 : %.2f\n", total);
        System.out.printf("평균 : %.2f\n", average);
    }
}
