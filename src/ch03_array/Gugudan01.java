package ch03_array;

import java.util.Scanner;

public class Gugudan01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("단 입력");
        int dan=scan.nextInt();

        for(int k=dan; k<=dan; k++){
            for (int l=1; l<20; l++){
                String gugu = "%2d * %2d = %3d\t";
                System.out.printf(gugu, k, l, (k*l));
            }
        }
        scan.close();
        System.out.println("\n\n구구단");
        for (int i=2; i<20; i++){ // 행(row)
            for (int j=1; j<20; j++){ // 열(column)n
//              String temp = i+" * "+k+" = "+(i*k)+"\t";
//              System.out.printf(temp);

                String temp = "%2d * %2d = %3d\t";
                System.out.printf(temp, i, j, (i*j));
            }
            System.out.println();
        }
    }
}
