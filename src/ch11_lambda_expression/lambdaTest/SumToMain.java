package ch11_lambda_expression.lambdaTest;

public class SumToMain {
    public static void main(String[] args) {
        SumToN obj=(x)->{
            int total=0;
            for (int i = 1; i <= x; i++) {
                total += i;
            }
            return total;
        };
        System.out.println("인터페이스형 변수를 이용한 람다식 구현부 호출하기");
        int result=obj.sum(10);
        System.out.println("결과01 : "+result);

        System.out.println("람다식과 정수를 메소드의 매개 변수로 전송하는 방식");
        staticSumToN(obj, 100); // 매개 변수(SumToN의 람다식, 정수)

        System.out.println("반환 타입이 SumToN 형 람다식인 메소드를 호출해 봅니다.");
        SumToN plus5=returnLamba();
        int[] arr={10, 20, 30};
        for (int i = 0; i < arr.length; i++) {
            String message="plus5.su(arr[%d]) = %d\n";
            System.out.printf(message, i, plus5.sum(arr[i]));

        }
    }

    private static SumToN returnLamba() {
        // 메소드 반환 타입이 SumToN 형식의 람다식이면 됩니다.
        return (su)->{return (su+5);};
    }

    private static void staticSumToN(SumToN asdf, int su) {
        // asdf 변수는 SumToN 타입이므로 sum() 메소드 호출이 가능합니다.
        // asdf의 sum() 메소드에 su라는 값을 대입합니다.
        System.out.println("결과02 : "+asdf.sum(su));
    }
}
