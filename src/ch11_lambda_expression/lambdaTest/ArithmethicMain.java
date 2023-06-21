package ch11_lambda_expression.lambdaTest;

public class ArithmethicMain {
    public static void main(String[] args) {
        int su01=14, su02=5;

        Arithmethic obj=(first, second)->first+second;
//        Arithmethic obj=(first, second)->{ return first+second; };
        System.out.println("덧셈 : "+obj.calc(su01, su02));

        obj=(first, second)->first-second;
        System.out.println("뺄셈 : "+obj.calc(su01, su02));

        obj=(first, second)->first*second;
        System.out.println("곱셈 : "+obj.calc(su01, su02));

        su02=0;
        System.out.println("second가 0일 때 방법01");
        obj=(first, second)-> {
            if (second == 0) {
                second = 5;
            }
            return first/second;
        };
        System.out.println("나눗셈 : "+obj.calc(su01, su02));

        System.out.println("second가 0일 때 방법02");
        obj=(first, second)-> {
            second=second==0?5:second;
            return first/second;
        };
        System.out.println("나눗셈 : "+obj.calc(su01, su02));
    }
}
