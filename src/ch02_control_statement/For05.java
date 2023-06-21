package ch02_control_statement;

public class For05 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 11; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("총합 : " + sum);
    }
}