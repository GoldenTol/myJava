package ch06_abstract_interface.uniconTest;

public interface Horse {
    int speed=70;
    // = public static final int speed = 70;
    // int speed; (X)
    // private(X) int speed = 70;

    // 접근지정자 반환타입 메소드이름(매개변수){}
    // public void run(){
    // public abstract가 암시적으로 선언되어 있기 때문에 추상메소드이다. 따라서 {}를 가질 수 없고 ; 사용하여야 한다.
    public void run();
    // = public abstract void fly();
}
