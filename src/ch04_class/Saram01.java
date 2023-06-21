package ch04_class;

// step 01) 클래스 정의(선언)
// 기존 데이터를 여러개 묶어서 만드는 사용자 정의 데이터 타입
// 새로운 물건을 만들어 내기 위한 template
public class Saram01 {
// 클래스의 구성 요소 각각을 member라고 부릅니다.
    String name;
    String nationality;
    double height;
    double weight;
    String hobby;
    String blood;

    // 주민번호 뒤 1자리가 들어오면, 해당 이름과 성별에 대한 정보를 반환해 줍니다.
    String showGenderInfo_(int juminno){
        // 메소드 이름은 showGenderInfo이고 숫자(juminno)를 입력해주면 문자열(String)로 돌려줍니다.
        // 메소드 내용물
        String gender="";
        if(juminno==1 || juminno ==3){
            gender="남자";
        }else {
            gender="여자";
        }
        String  result=name+"님은 "+ gender+"입니다.";
        return result;
    }
    // menber 변수들의 값 출력하기
    // void) 메소드를 반환하지 않을 때 사용하는 키워드
    // return 구문도 필요 없음
    void Display() {
        /* 소괄호가 있다는건 메소드라는 의미
        따라서 Display이란 이름의 메소드
        매개 변수는 없을 수도 있지만 소괄호는 반드시 입력
         */
        System.out.println(name + "님의 신상 정보");
        System.out.println("이름 : " + name);
        System.out.println("국적 : " + nationality);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("취미 : " + hobby);
        System.out.println("혈액형 : " + blood);
    }

    String showBmiInfo(){
        double newHeight=height/100;
        double rate=weight/(newHeight*newHeight);
        String bmi="";

        if(rate>=25.00){
            bmi="비만";
        } else if (rate>=23.00) {
            bmi="과체중";
        } else if (rate>=18.50) {
            bmi="정상";
        }else {
            bmi="저체중";
        }
        String result=name+"님은 "+bmi+"입니다.";
        return result;
    }
}
