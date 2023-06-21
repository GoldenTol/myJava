package ch08_exception;

public class ExcepTest03 {
    public static void main(String[] args) {
        String str="hello korea";

        try {
            int idx=str.indexOf("asdf");
            String temp=str.substring(0, idx);
            System.out.println(temp);

        } catch (StringIndexOutOfBoundsException err) {
            System.out.println("String 길이를 벗어났습니다.");
            err.printStackTrace();

        } catch (Exception err) {
            System.out.println("나머지 기타 예외 발생");

        } finally {
            System.out.println("무조건 실행");
        }
    }
}
