package ch04_class;

import java.util.Scanner;

public class StaticTest {
    // main 메소드는 static 메소드입니다.
    public static void main(String[] args) {
        // 스태틱 변수는 클래스 이름으로 접근 가능
        System.out.println(Mathematics.first);
        // System.out.println(Mathematics.second); ←(X)인스턴스 변수는 클래스로 접근이 안되기 때문에
        Mathematics math=new Mathematics();
        // math라는 객체를 생성하고
        System.out.println(math.second);
        // Mathematics가 아닌 math라는 객체를 통해 접근

        Scanner scan=new Scanner(System.in);
        System.out.print("x 값은 : ");
        int x= scan.nextInt();
        System.out.print("y 값은 : ");
        int y= scan.nextInt();

        int result=Mathematics.max(x, y);
        System.out.println("최대 값 : "+result);
        result=math.min(x, y);
        System.out.println("최소 값 : "+result);
        result=math.max2(x, y);
        System.out.println("최대 절대 값 : "+result);
        result=math.min2(x, y);
        System.out.println("최소 절대 값 : "+result);

//        int abs=math.abs(x);
//        System.out.println("절대 값 : "+abs);

//        public static int abs(int x) {
//        if (x < 0) {
//            x = -x;
//        }
//        return x;

        StaticTest st=new StaticTest();
        st.sayHello("김철수");
    }
    public void sayHello(String name){
        System.out.println(name+"님 안녕하세요.^^");
    }
    }
