package ch01_variable_operator;

public class OperatorEx {
    public static void main(String[] args) {
        int a = 3 - -2, b = 3; // a=5, b=3
        int x = (a >= b) ? 5 : (a + 2);
        // x는 (5>=3) 이 참이라면 5 거짓이면 7 → x=5

        x += ++a; // x = x + ++a → a = 6 → x = 5 + 6 → x = 11
        int y = ++a; // a = 7 → y=7
        y += a + --b; // y = y + a + --b → b = 2 → y = 7 + 7 + 2 → y = 16

        char ch3 = 'D';
        int z = ch3 >= 'A' && ch3 <= 'Z' ? --y : x + 2;
        /* z = D가 A보다 크거나 같고 Z보다 작거나 같다가 참이라면 15, 거짓이라면 13
           → true → z = 15
         */

        int result = 0;
        result = x > y ? z - y : x + z;
        /* x = 11, y = 16, z = 15 일 때 11 > 16가 참이라면 15 - 16 거짓이라면
           11 + 15 → result = 26
        */

        System.out.println("result : " + result);
        // result : 29
    }
}
