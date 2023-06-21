package ch04_class;

public class Saram02 {
   static String nationality="대한민국";
   // 스태틱 변수 = 클래스 변수 ..클래스 이름 뒤에 온점을 찍으면 나오기 때문에
    // 클래스 이름으로 접근 가능하므로 클래스 변수라고 부르기도 합니다.

    // 나머지는 맴버 변수 = instance(인스턴스 변수) 변수
    String name;
    double height;
    double weight;
    String hobby;
    String blood;

    // 외부에서 입력한 실수 2개(매개 변수)를 입력하여 평균을 구하는 메소드
    double avg(double x,double y){
     // 지역 변수는 반드시 초기화 하세요.
     // int a;
     // System.out.println(a);

     // final 키워드는 read only 개념으로 이해 바랍니다.
     final double pi=3.14; // 상수(constant)
     // pi=5.14;
     System.out.println(pi);

     double result=(x+y)/2.0;
     return result;
 }
}
