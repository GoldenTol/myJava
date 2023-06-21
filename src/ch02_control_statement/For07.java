package ch02_control_statement;

public class For07 {
    public static void main(String[] args) {

        double total = 0;
        System.out.println("if 구문");
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                total -= (double) 1 / i;
            } else{
                total += (double) 1 / i;
            }
        }
        System.out.println("총합 : " + total);
        System.out.println("\n");

        System.out.println("조건연산자 구문");
        total = 0;
        for (int i = 1; i < 101; i++){
            total += i%2 == 0 ? -(double)1/i : (double)1/i;
        }
        System.out.println("총합 : " + total);
    }
}
