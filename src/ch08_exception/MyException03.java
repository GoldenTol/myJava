package ch08_exception;

public class MyException03 {
    public static void main(String[] args) {
        String xx="aa";

        try{
            first(xx); // first() 메소드 호출
        } catch (ArithmeticException err) {
            System.out.println("0으로 나누지 마세요");

        } catch (NumberFormatException err) {
            System.out.println("숫자로 입력하세요");
            err.printStackTrace();

        } catch (Exception err) {
            System.out.println("나머지 기타 예외 발생");

        } finally {
            System.out.println("무조건 실행");
        }
    }
    static void  first(String xx) throws ArithmeticException, NumberFormatException {
        int x=Integer.parseInt(xx);
        second(); // second() 메소드 호출


    }
    static void second() throws ArithmeticException {
        third(); // third() 메소드 호출
    }
    static void third() throws ArithmeticException {
        int i=1;
        int j=0;
        System.out.println(i/j);

    }
}
