package ch02_control_statement;

import javax.swing.text.BadLocationException;
import java.util.Scanner;

public class AdultCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("이름 입력 : ");
        String name = scan.next();

        System.out.println("나이 입력 : ");
        int age = scan.nextInt();

        System.out.println("성별 입력 : ");
        int _gender = scan.nextInt();

        String adult;
        if (age>=19) {
            adult = "성인";
        }else{
            adult = "미성년자";
        }
        String gender;
        if (_gender%2 == 0) {
            gender = "여자";
        }else{
            gender = "남자";
        }
        scan.close();
        System.out.println("\n");

        System.out.println("이름 : "+name+", 나이 : "+age+", 성인 체크 : "+adult+", 성별 : "+gender);
        System.out.printf("이름 : %s, 나이 : %f. 성인 체크 : %s, 성별 : %s", name, age, adult, gender);
    }
}
