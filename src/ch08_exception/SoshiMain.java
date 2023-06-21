package ch08_exception;

import java.util.Scanner;

public class SoshiMain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] sosi={"서현", "수영", "써니", "태연", "윤아", "효연", "티파니", "유리"};

        System.out.print("맴버 이름 : ");
        String name= scan.next();

        // flag 변수, 맴버가 맞으면 true로 변경하겠습니다.
        boolean isMember=false;
        for (int i = 0; i < sosi.length; i++) {
            if (name.equals(sosi[i])) {
                isMember=true;
                break;
            }
        }
        if (isMember == true){
            String imsi ="%s님은 소시 맴버가 맞습니다.\n";
            System.out.printf(imsi, name);
        } else {
            String message=name+"님은 소시 맴버가 아닙니다.";

            try {
                throw new GirlException(message);
            } catch (GirlException err) {
                System.out.println(err.toString());
                System.out.println(err.getMessage());
                err.printStackTrace();
            }
        }
    }
}
