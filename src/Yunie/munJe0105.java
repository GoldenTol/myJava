package Yunie;

public class munJe0105 {
    String bankname, name;
    double juminno, no, balance;

    void Display1() {
        System.out.println(name + "님의 신상 정보");
        System.out.println("이름 : " + name);
    }

    void Display2() {
        System.out.println("생년월일 : " + juminno);
        System.out.println("주은행 : " + bankname);
        System.out.println("계좌번호 : " + no);
        System.out.println("예치금 : " + balance);
    }

    String genderInfo(int juminno) {
        String gender = "";
        if (juminno == 1 || juminno == 3) {
            gender = "남자";
        }else{
            gender = "여자";
        }
        String message="성별 : " + gender;
        return message;
    }
}
