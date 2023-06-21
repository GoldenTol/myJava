package ch06_abstract_interface.myShape;

public class Ractangle extends Shape{
    private double width; // 밑변
    private double height; // 높이

    public Ractangle(double width, double height, String lineColor, String fillColor) {
        super(lineColor, fillColor);
        this.width = width;
        this.height = height;
        // 생성자의 마지막에서 면적을 구해줍니다.
        super.area=this.calcArea();
    }
    @Override // 구현된 메소드
    public double calcArea() {
        return this.width*this.height;
    }
    public void Display() {
        // 면적 출력과 그리기 동작을 구현
        System.out.println("사각형의 면적 : "+super.area);
        super.draw();
    }
}
