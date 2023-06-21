package ch02_control_statement;
import  java.util.Random;
import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
//        Random rand=new Random(); // rand 랜덤 객체
//        for(int i =0; i<10; i++){
//            // nextInt 메소드는 정수 추출하는 동작
//            int rnd=rand.nextInt(100)+1;
//            // (bound: 100) = 0~99까지 → (bound: 100)+1 = 1~100까지
//            System.out.println(rnd);
//        }
        Scanner scan=new Scanner(System.in);

        while(true){ //while 무한 루프
            System.out.print("점수 입력 : ");
            int grade=scan.nextInt();
            if(grade==0){
                System.out.println("0이어서 종료합니다.");
                break;
            }else if(grade<0){
                System.out.println("음수이어서 종료합니다.");
                break;
            }
        }
    }
}
