package ch03_array;

public class DoubleFor3 {
    public static void main(String[] args) {
        int total=0;

        for (int i=1; i<4; i +=2){
            for (int k=2; k<6; k += 3){
                total += 2*i+k;
            } // end for
        } // end for
        System.out.println("총합 : "+total);
    }
}
