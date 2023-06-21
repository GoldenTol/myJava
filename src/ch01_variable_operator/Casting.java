package ch01_variable_operator;

public class Casting {
    public static void main(String[] args) {
        // 암시적 형변환 (Implicit Casting)
        double d = 100;

        System.out.println("d : " + d);

        // 명시적 형변환 (Explicit Casting)
        int i = (int) 12.5; //(int)를 캐스트 연산자라고 합니다.

        System.out.println("i : " + i);

        System.out.println(14 / 5);

        System.out.println((double) 14 / 5);
        // (double) 14/5 → 14.0/5 → 14.0/5.0 → 2.8

        System.out.println((double) (14 / 5));
        // (double) (14/5) → (double) (2) → 2.0
        System.out.println("\n");

        int kor = 50, eng = 60, math = 80;
        int total = kor + eng + math;

        System.out.println("총점 : " + total);

        double average = total / 3.0;
        average = (double) total / 3;

        System.out.println("평균 : " + average);
        System.out.println("평균 : " + average);
        System.out.println("\n");

        char ch1 = 'c';
        char ch2 = 'a';
        boolean bool = ch1 > ch2; // 99>97

        System.out.println("bool : " + bool);
        System.out.println("\n");

        int result = ch1 - ch2 + 5; // 99 - 97 +5

        System.out.println("resrult : " + result);
        System.out.println("\n");

        char ch3 = 'D';
        String str = (ch3 >= 'A') && ('Z' >= ch3) ? "대문자맞음" : "대문자아님";

        System.out.println("대문자판단 : " + str);
        System.out.println("\n");

        char ch4 = 'e';
        char munja=(char)(ch4-('a'-'A'));

        System.out.println(munja);
        System.out.println("\n");
    }
}
