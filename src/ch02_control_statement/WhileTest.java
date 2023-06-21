package ch02_control_statement;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("몇 단을 출력할까요?");
        int dan= scan.nextInt();

        int total=0;
        int i=1;
        while (i<100){
            String temp=dan+" * "+i+" = "+(dan*i);
            System.out.println(temp);
            i++;
        }
        scan.close();
    }
}
