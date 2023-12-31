package ch05_package_inheritance;

// final 클래스는 서브 클래싱이 불가능한 클래스입니다.
class Mclass{ // 수퍼 클래스
    static final String message="안녕하세요.";
    public void Display(){ // 일반 메소드
        // Display 메소드는 사용자의 필요에 의하여 오버라이딩이 가능합니다. 강제성이 없습니다.
        System.out.println("호호호");
    }
    // 파이널 메소드는 오버라이딩을 하니 못하게 강제성을 부여하는 메소드입니다.
    // 반드시 책임이 따르므로, 완벽하게 구현해야 합니다.
    public final void Some(){ // 파이널 메소드
        System.out.println("나는 final메소드입니다.");
    }
}
class CClass extends Mclass{ // 서브 클래스
    @Override // 저는 오버라이딩 된 메소드입니다.
    public void Display() {
        System.out.println("하하하");
    }
}
public class Final01{
    public static void main(String[] args) {
//        final 키워드는 읽기 전용입니다. 할당 못함
//        Mclass.message="hello";
        CClass obj1=new CClass();
        obj1.Display();
        obj1.Some(); // 참조는 가능하지만 오버라이딩은 못하는 some 메소드.. 이런 파이널..
    }
}

