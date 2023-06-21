package ch04_class;

public class OverAdd {
    public void Add(int x, int y){
        System.out.println("1.   정수 x 정수 / x + y = "+(x+y));
    }
    public void  Add(double x, double y){
        System.out.println("2.   실수 x 실수 / x + y = "+(x+y));
        System.out.printf("2-1. 실수 x 실수 / x + y = %.2f\t", (x+y));
    }

    public int Add(int x, int y, int z){
        return x+y+z;
    }
    public void  Add(int x, double y) {
        System.out.println("4.   정수 x 실수 / x + y = " + (x + y));
        System.out.printf("4-1. 정수 x 실수 / x + y = %.2f\t", (x + y));
    }
}
