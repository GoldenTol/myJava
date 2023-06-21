package ch04_class;

public class SaramMain01 {
    public static void main(String[] args) {
        /* step 02) 객체 생성
        규칙) 생성자의 이름은 클래스의 이름과 동일해야 합니다.
        생성 문법)
        클래스이름 객체이름 = new 생성자 이름();
            ↓       ↓     ↓  ↓       ↓            */
         Saram01   yusin  = new  Saram01();
        Saram01 soon;
        soon=new Saram01();

        /* step03) 맴버 변수에 값 할당(대입)_write
        맴버 변수는 dot(.) 연산자를 이용하여 접근합니다.
        객체이름.변수이름 = 값;
           ↓       ↓    ↓ ↓                        */
         yusin . name   = "김유신";
         yusin.nationality="대한민국";
         yusin.height=172.5;
         yusin.weight=75.0;
         yusin.hobby="당구";
         yusin.blood="AB";
        // step04) 맴버 변수의 값 출력_read
        System.out.println("김유신에 대한 정보");
        System.out.println("이름 : "+yusin.name);
        System.out.println("국적 : "+yusin.nationality);
        System.out.println("키 : "+yusin.height);
        System.out.println("몸무게 : "+yusin.weight);
        System.out.println("취미 : "+yusin.hobby);
        System.out.println("혈액형 : "+yusin.blood);
        System.out.println();

        soon.name="유관순";
        soon.nationality="대한민국";
        soon.height=168.5;
        soon.weight=52.0;
        soon.hobby="축구";
        soon.blood="O";
        System.out.println("유관순에 대한 정보");
        System.out.println("이름 : "+soon.name);
        System.out.println("국적 : "+soon.nationality);
        System.out.println("키 : "+soon.height);
        System.out.println("몸무게 : "+soon.weight);
        System.out.println("취미 : "+soon.hobby);
        System.out.println("혈액형 : "+soon.blood);
        System.out.println();

        // 메소드가 실행되려면 호출이 일어나야 합니다.
        System.out.println("'메소드 호출' 예시");
        /* 주민번호 뒤의 1자리를 입력하여 성별 정보를 다음과 같이 출력해 봅시다.
        김유신님은 남자입니다.
         */
        String message=yusin.showGenderInfo_(3);
        System.out.println(message);

        yusin.Display();
        String result=yusin.showBmiInfo();
        System.out.println(result);
        System.out.println();

        int jumino=4;
        message=soon.showGenderInfo_(jumino);
        System.out.println(message);

        soon.Display();

        result=soon.showBmiInfo();
        System.out.println(result);
        System.out.println();

        // 타입[] 배열이름 = new 타입[요소개수];
        Saram01[] saram=new Saram01[2]; // 배열 정의

        System.out.println("배열 요소들에 대한 객체 생성 및 값 할당");
        for (int i=0; i<saram.length; i++){
            /*클래스이름 객체이름 = new 생성자 이름();
                 ↓       ↓     ↓   ↓       ↓            */
             //saram    [i]    =  new Saram01(); // 객체 생성
            saram[i]=new Saram01();
            saram[i].name="철수"+(i+1);
            saram[i].height=160.0+10.0*(i+1);
            saram[i].weight=60.0+10.0*(i+1);
        }
        System.out.println("배열 요소들 값 출력");
        for (int i = 0; i <saram.length ; i++) {
            saram[i].Display();
        }
    }
}
