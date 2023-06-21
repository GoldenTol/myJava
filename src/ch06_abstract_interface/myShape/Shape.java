package ch06_abstract_interface.myShape;

public abstract class Shape { // 추상 메소드가 들어있는 클래스는 반드시 추상 클래스
    // 모든 도형들은 선과 채우기 색상을 가지므로 일반화 된 변수로 볼 수 있다.
    private String lineColor; // 도형 선 색상
    private String fillColor; // 도형 채우기 색상
    protected double area; // 면적
    // 추상 메소드
    public abstract double calcArea(); // 추상메소드란 업무의 표준을 잡기 위해 강제로 밀어붙이는 표본
    public abstract void Display();

    public Shape() {
    }

    public Shape(String lineColor, String fillColor) {
    this.lineColor=lineColor;
    this.fillColor=fillColor;
    }
    public final void draw(){
        System.out.println("라인 색상 : "+this.lineColor);
        System.out.println("채우기 색상 : "+this.fillColor);
    }
}
