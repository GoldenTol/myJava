package z_jindal.functionalInterface;

import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
//        다음 예제는 apply() 메서드 사용 방법입니다.
//                먼저, 세 개의 Function 타입의 객체를 생성하며 특정 작업을 수행 후 값을 반환하는 람다 표현식을 할당합니다.
//
//        - functionAdd 객체는 Integer 타입의 매개변수를 전달받아 100을 더한 결과를 문자열로 반환합니다.
//                - functionMinus 객체는 Integer 타입의 매개변수를 전달받아 100을 뺄셈한 결과를 문자열로 반환합니다.
//                - functionMultiple 객체는 Integer 타입의 매개변수를 전달받아 100을 곱한 결과를 문자열로 반환합니다.
        Function<Integer, String> functionAdd =
                (num) -> Integer.toString(num + 100);

        Function<Integer, String> functionMinus =
                (num) -> Integer.toString(num - 100);

        Function<Integer, String> functionMultiple =
                (num) -> Integer.toString(num * 100);

        System.out.println("50 + 100 = " + functionAdd.apply(50));
        System.out.println("50 - 100 = " + functionMinus.apply(50));
        System.out.println("50 * 100 = " + functionMultiple.apply(50));

        int sss = 100 ;

        Function<Integer, Integer> functionAdd2 =
                (num) -> num + sss;

        Function <Integer, Integer> functionMultiple2 =
                (num) -> num * 10;

        System.out.println("(50 * 10) + 100 = " +
                functionAdd2.compose(functionMultiple2).apply(50));
    }
}
