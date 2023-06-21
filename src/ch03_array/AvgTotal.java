package ch03_array;

public class AvgTotal {
    public static void main(String[] args) {
        double[]arr={12.3, 45.6, 78.9};
        double total=0, average=0;

        for (int i=0; i<arr.length; i++){
            total += arr[i];
        }
        average=total/ arr.length;
        System.out.println("총점 : "+total);
        System.out.println("평균 : "+average);
    }
}
