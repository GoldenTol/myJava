package ch02_control_statement;

public class For06 {
    public static void main(String[] args) {

        double total=0;
        int i=0;
        for(i=1; i<101; i++){
            total +=(double)1/i; // == total += 1.0/i;
        }
        System.out.println("총합 : "+total);

        System.out.println("\n");
        total=0;
        for(i=1; i<101; i++){
            total +=(double)(i-1)/ i;
        }
        System.out.println("총합 : "+total);

    }
}
