package ch02_control_statement;

import java.util.Scanner;

public class WhileTest3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /* Math : 수학공식과 관련된 클래스
        int su = -12;
        su=Math.abs(su);
        System.out.print(su);
         */

        System.out.print("원하는 !(팩토리얼) 값을 입력 : ");
        int su= scan.nextInt();

        if(su<0){
            su=Math.abs(su);
        }
        int factorial=1;

        while(su>1){
            factorial *= su;
            su--;
        }
        System.out.println("! 값은 "+factorial);
        scan.close();
    }
}
