package ch06_abstract_interface.myShape;

public class Circle extends Shape{
    private double radiua; // 반지름
    private double xpos; // x좌표
    private double ypos; // y좌표

    public Circle(double radiua, double xpos, double ypos, String lineColor, String fillColor) {
        super(lineColor, fillColor);
        this.radiua = radiua;
        this.xpos = xpos;
        this.ypos = ypos;
        super.area=this.calcArea();
    }
    @Override
    public double calcArea() {
        return Math.PI*this.radiua*this.radiua;
    }
    public void Display() {
        // 면적 출력과 그리기 동작을 구현
        System.out.printf("원의 면적 : %.3f\n", super.area);
        System.out.printf("원의 중심 : ("+xpos+", "+ypos+")");
        super.draw();
    }
}
