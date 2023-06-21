package ch01_variable_operator;

public class MyBox {
    public static void main(String[] args) {
        double width;
        double height;
        double area;
        double perimeter;

        width=10.0;
        height=5.0;
        area=width*height;
        perimeter=(width+height)*2.0;

        System.out.println("사각형의 넓이 : "+area+"\n사각형의 둘레 : "+perimeter);

        String result="\n사각형의 넓이 : ";
        result=result+area;
        result=result+"\n사각형의 둘레 : ";
        result=result+perimeter;
        System.out.println(result);
    }
}
