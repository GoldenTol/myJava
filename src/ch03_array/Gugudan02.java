package ch03_array;

import java.util.Scanner;

public class Gugudan02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("시작 단수 입력 (begin)");
        int begin=scan.nextInt();

        if(begin<0){
            begin=Math.abs(begin);
        }
        System.out.println("끝 단수 입력 (end)");
        int end= scan.nextInt();

        if(end<0){
            end=Math.abs(end);
        }
        // swap 기법 : 두 개의 변수 값을 서로 맞바꾸는 알고리즘 기법
        int imsi;
        if(begin>end){
            imsi=begin;
            begin=end;
            end=imsi;
        }

        for (int i=begin; i<=end; i++){
            for (int j=1; j<10; j++){
                System.out.printf("%d * %d = %2d\t", i, j, (i*j));
            }
            System.out.println();
        }
        scan.close();
    }
}
