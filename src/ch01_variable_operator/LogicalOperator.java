package ch01_variable_operator;

public class LogicalOperator {
    public static void main(String[] args) {
        // hard coding
        System.out.println(3>=2);
        System.out.println(!(3>=2));
        System.out.println(3==2);
        System.out.println(3!=2);
        System.out.println(3.45<2);

        System.out.println("------------------------------------------");

        System.out.println((3>2)&&(3>4)); // true && false = false

        int x=3, y=2;
        System.out.println((x!=y)||(-1>0)); // true || false = true

        // 문자는 정수값으로 변환되어 연산이 됩니다.
        System.out.println('a'>'b'); // 통상적으로 문자 a는 문자 b보다 왼쪽에 있다.
    }
}
