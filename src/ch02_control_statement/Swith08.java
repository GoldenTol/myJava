package ch02_control_statement;

import java.util.Scanner;

public class Swith08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("1 ~ 12 사이의 정수 입력 : ");
        int month = scan.nextInt();

        String season;
        if (month>=3 && 5>=month) {
            season = "봄";
        }else if(month>=6 && 8>=month) {
            season = "여름";
        } else if (month>=9 && 11>=month) {
            season = "가을";
        } else {
            season = "겨울";
        }

        System.out.println(month+"월은 "+season+"입니다.");
        System.out.printf("%d월은 %s입니다.\n" ,month, season);

        switch (month) {
            case 3 : case 4 : case 5 :
                System.out.println(month + "은 봄입니다.");
                break;

            case 6 : case 7 : case 8 :
                System.out.println(month + "월은 여름입니다.");
                break;

            case 9 : case 10 : case 11 :
                System.out.println(month + "월은 가을입니다.");
                break;

            default :
            // case 12 : case 1 : case 2 :
                System.out.println(month + "월은 겨울입니다.");
                break;
        }
    }
}
