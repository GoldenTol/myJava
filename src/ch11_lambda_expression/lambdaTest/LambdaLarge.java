package ch11_lambda_expression.lambdaTest;

@FunctionalInterface
// 실수로 미연에 방지하기 위한 바리케이트 같은 역할로 적어놓고 시작하면 좋다.
public interface LambdaLarge {
    int large(int su01, int su02);
    // int small(int su01, int su02);
    // 인터페이스 안에 추상 메소드를 2개 이상 만들면 안됩니다.
}
