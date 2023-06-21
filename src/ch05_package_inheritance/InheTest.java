package ch05_package_inheritance;

public class InheTest {
    public static void main(String[] args) {
        Mysub sub=new Mysub();
        System.out.println(sub.getClass());
        sub.y=500; // 해당 객체의 맴버 변수이므로 접근이 가능하다.
        System.out.println("sub.y = "+sub.y);
        sub.x=700; // Mysub가 상속을 받고 있기 때문에 상속을 받은 수퍼 클래스 변수에 접근이 가능하다.
        System.out.println("sub.x = "+sub.x);

        // private 변수는 상속이 되지 않습니다.
        // sub.hello="xxx";
        sub.sayhello("김철수", "열여덟");
    }
}
