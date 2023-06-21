package z_jindal.functionalInterface;

import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
//      람다 표현식은 Integer 타입의 매개변수에서 10을 곱한 결과를 콘솔에 출력합니다.
//      accept() 메서드에 Integer 타입의 값을 전달하면, 람다 표현식으로 작성한 로직이 실행됩니다.
        System.out.println("정수의 10배 값 출력하기");
        Consumer<Integer> consumer =
                (num) -> System.out.println(num + " * 10 = " + (num * 10));

        consumer.accept(100);
        consumer.accept(200);
        consumer.accept(400);

        System.out.println("\nandThen 디폴트 메소드 사용하기");
        Consumer<Integer> add =
                (num) -> System.out.println(num + " + 100 = " + (num + 100));

        Consumer<Integer> sub =
                (num) -> System.out.println(num + " - 100 = " + (num - 100));

        Consumer<Integer> mul =
                (num) -> System.out.println(num + " * 100 = " + (num * 100));
//        다음 예제는 Integer 타입인 매개변수의 값에 100을 더한 결과를 출력하는 add, 100을 뺄셈한 결과를 출력하는 ConsumerMinus, 100을 곱한 결과를 출력하는 mul이 존재합니다.
//        덧셈 → 뺄셈 → 곱셈 순서로 Consumer가 실행됩니다.
        add.andThen(sub.andThen(mul)).accept(50);
    }
}
