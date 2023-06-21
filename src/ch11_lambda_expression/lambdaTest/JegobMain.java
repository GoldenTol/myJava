package ch11_lambda_expression.lambdaTest;

public class JegobMain {
    public static void main(String[] args) {
        double su01 = 3.0;
        double su02 = 6.0;

        Jegob squareAdd=(first, second)->{
            return Math.pow(first, 2.0)+Math.pow(second, 2.0);
        };
        System.out.println("제곱의 합 : "+squareAdd.jegob(su01, su02));

        Jegob squareSub=(first, second)->{
            return Math.pow(first, 2.0)-Math.pow(second, 2.0);
        };
        System.out.println("제곱의 차 : "+squareSub.jegob(su01, su02));

        Jegob absSquareSub=(first, second)->{
            return Math.abs(Math.pow(first, 2.0)-Math.pow(second, 2.0));
        };
        System.out.println("제곱의 차 절대 값: "+absSquareSub.jegob(su01, su02));
    }
}
