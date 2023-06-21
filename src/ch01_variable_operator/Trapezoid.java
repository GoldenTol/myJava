package ch01_variable_operator;

public class Trapezoid {
    public static void main(String[] args) {
        float basewidth;
        float topwidth;
        float height;
        float area;

        basewidth=20.0f;
        topwidth=10.0f;
        height=15.0f;
        area=(basewidth+topwidth)*height/2.0f;

        System.out.println("밑변 : "+basewidth+", 윗변 : "+topwidth+", 높이 : "+height);
        System.out.println("면적 : "+area);

        String result="\n밑변 : "+basewidth;
        result=result+", 윗변 : "+topwidth;
        result=result+", 높이 : "+height;
        result=result+"\n면적 : "+area;
        System.out.println(result);
    }
}
