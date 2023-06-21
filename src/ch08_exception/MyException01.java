package ch08_exception;

public class MyException01 {
    public static void main(String[] args) {
        int x=3, y=0;
        int[] arr={10, 20, 30};

        try {
            arr[3]=50; // 배열 요소 인덱스 문제
            System.out.println(x/y); // 0으로 나누기 문제

            System.out.println("예외 발생시 저는 실행이 안됩니다.");

        }catch (ArithmeticException err){ // 서브 클래스
            // 수퍼 클래스 : Exception
            // err은 지역변수로 예외상황이 생기면 객체를 생성한다.
            System.out.println("0으로 나누면 안 돼요.");

        }catch (ArrayIndexOutOfBoundsException err){ // 서브 클래스
            // 수퍼 클래스 : Exception
            // err은 지역변수로 예외상황이 생기면 객체를 생성한다.
            // ArrayIndexOutOfBoundsException err(객체 이름은 마음대로 설정 가능)=new ArrayIndexOutOfBoundsException err();
            System.out.println("배열 인덱스 범위를 벗어났습니다.");
            System.out.println("예외 객체 정보 확인");
            System.out.println("메시지 : "+err.getMessage());
            System.out.println("문자열 : "+err.toString());

            err.printStackTrace(); // 오류 내용을 추적하여 메시지들을 출력 // 효율적인 디버깅을 위해 항상 작성하기 추천

        }catch (Exception err) { // 수퍼 클래스가 가장 밑에 작성
            System.out.println("기타 나머지 예외 발생");
            err.printStackTrace();

        }finally {
            System.out.println("나는 무조건 실행이 됩니다.");
        }
    }
}
