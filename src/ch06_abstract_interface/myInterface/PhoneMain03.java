package ch06_abstract_interface.myInterface;

/*
        1. 문자 내용을 클래스 외부에서 입력 받아서 처리하기
        송신자 '01012345678'로부터 '잘 있었니?'라는 문자가 왔습니다.
        2. 노래 여러 곡을 입력 받아서 재생시키기
        배열로 입력해주면 될듯...
        3. 휴대폰 1대에 문자를 3번 보내기
        전송할 문자열은 배열 초기화로 사용하면 될듯...
        4. 여러 개의 휴대폰에 동일한 문자를 보내 보기
        휴대폰 목록을 배열 초기화, 보낼 문자는 String ...

<출력예시>----------------------------------
송신자 '01012345678'로부터 '잘 있었니?'라는 문자가 왔습니다.
----------------------------------
여러 곡 재생하기
1번째 노래 '광화문 연가' 재생
2번째 노래 '사랑과 우정 사이' 재생
----------------------------------
휴대폰 1대에 문자를 여러 번 보내기
수신자 01012345678에게 여러 개의 문자를 전송합니다.
1번째 문자 '잘 지내지?' 전송
2번째 문자 '조만간 함 볼래' 전송
----------------------------------
수신자 '01011112222'에게 '문자 배달이요~~' 문자를 보냅니다.
수신자 '01033334444'에게 '문자 배달이요~~' 문자를 보냅니다.
수신자 '01055556666'에게 '문자 배달이요~~' 문자를 보냅니다.
        */
public class PhoneMain03 {
    public static void main(String[] args) {
//        String phoneNo = "01012345678" ;
//
//        System.out.println("----------------------------------");
//        SmartPhone phone01 = new SmartPhone(phoneNo);
//        phone01.receiveCall("잘 있었니?");
//
//        System.out.println("----------------------------------");
//        String[] songs = {"광화문 연가", "사랑과 우정 사이"};
//        phone01.play(songs);
//
//        System.out.println("----------------------------------");
//        String[] sendlist = {"잘 지내지?", "조만간 함 볼래"};
//        phone01.sendSMS(sendlist);
//
//        System.out.println("----------------------------------");
//        SmartPhone[] array = new SmartPhone[3] ;
//        array[0] = new SmartPhone("01011112222");
//        array[1] = new SmartPhone("01033334444");
//        array[2] = new SmartPhone("01055556666");
//
//        for (int i = 0; i < array.length; i++) {
//            array[i].sendSMS("문자 배달이요~~");
//        }
    }
}
/*
PhoneMain01
1) SmartPhone에 생성자 만들기
2) SmartPhone에 생성자를 위한 변수 만들기
3) MobilePhone와 Mp3에 추상 메소드 만들기
4) SmartPhone에 6개의 추상 메소드 오버라이딩 틀 입력하기
5) Pda에 x, y를 위한 메소드 만들기
6) SmartPhone (sendCall)에 오버라이딩
- "송신자", "수신자" 변수 지정
- 출력 메세지 입력 후 return false;
7) SmartPhone(receiveCall, sendSns, receiveSns)에 오버라이딩
- ex)송신자/수신자+this.phoneNo+"로부터 문자가 옵니다/보냅니다.
8) SmartPhone playTime 추가 해보기 (힌트를 주자면 저번에 4000초 시간, 분, 초로 나눴던 메소드 이용)

PhoneMain02
1) MiniPhone에 매개변수 String phoneNo 생성자 만들초기 super(phoneNo)
2) SmartPhone에 MiniPhone 메소드 오버라이딩 하기
3) SmartPhone에 매개변수 0개짜리 생성자 만들어놓기 (사용 하던 안 하던)
4) MiniPhone에 sendSMS, receiveSMS 오버라이딩 하기
- phoneNo는 SmartPhone에 있기 때문에 접근 할 수 없다. 따라서 phoneNO의 getter 만들기

PhoneMain03
1) MobilePhone의 receiveCall 매개변수가 없기 때문에 MobilePhone에 그대로 매개변수 있는 메소드로 오버라이딩
2) SmartPhone의 receiveCall에 출력 메세지 입력하기 return false;
3) Mp3에 추상 메소드
4) SmartPhone에 Mp3의 추상메소드 오버라이딩
- 반복이기 때문에 for문장 돌리기
5) SmartPhone에 sendSNS 추상메소드 오버라이딩
6) MobilePhone에 sendSNS 메소드 그대로 한 번 더 매개변수 다르게 오버라이딩
7) SmartPhone에 sendSNS 오버라이딩
-출력할 내용 입력
-배열로 진행
 */
