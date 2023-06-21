package ch04_class;

public class OverLoadMain {
    public static void main(String[] args) {
        int a=3, b=5, c=7;
        double x=1.1, y=2.2;

        OverAdd obj=new OverAdd();
        obj.Add(a,b);

        obj.Add(x, y);
        System.out.println();

        int result= obj.Add(a,b,c);
        System.out.println("3.   반환 결과 / "+result);

        a=100;
        b=200;
        obj.Add(a,b);

        x=5.5;
        y=3.3;
        obj.Add(x, y);

        System.out.println();
        obj.Add(a,x);
    }
}
