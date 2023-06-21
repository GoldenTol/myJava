package ch03_array;

import java.util.Scanner;

public class StudentExam2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*스캐너로 학생수 로 입력 받기
        학생 이름은 1차원 배열 선언
        점수 목록은 2차원 배열 선언
        외부for(학생이름)
            이름 입력 받고
        내부for(학생별 점수)
         */
        System.out.print("학생 수 입력 : ");
        // 학생 숫자가 2차원 배열의 행이 됩니다.
        int row=scan.nextInt();
        System.out.print("시험 수 입력 : ");
        int column=scan.nextInt(); // 시험 점수(국어, 영어, 수학)

        String[]name = new String[row]; // 학생들 이름
        double[][]jumsu=new double[row][column];

        for (int i=0; i<row; i++){
            System.out.print((i+1)+"번째 학생 이름 입력 : ");
            name[i]= scan.next();

            double total =0.0;

            for (int j=0; j<column; j++){
                System.out.print((j+1)+"번째 점수 입력 : ");
                jumsu[i][j]= scan.nextDouble();
                total += jumsu[i][j];
            }
            double average=total/column;

            String imsi="\n%d번째 학생의 정보\n";
            imsi += "이름 : %s, 총점 : %.0f, 평균 : %.2f\n\n";

            System.out.printf(imsi, (i+1), name[i], total, average);
        }
        scan.close();
    }
}
