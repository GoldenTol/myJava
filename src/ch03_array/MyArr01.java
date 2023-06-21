package ch03_array;

public class MyArr01 {
    public static void main(String[] args) {
        /*int x = 3;
        int y = 5;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // new 연산자를 사용하는 방법
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        arr[0] = x - y + 6;
        arr[2] = arr[0] + 3;
        arr[1] = arr[0] + arr[2];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int[] brr = {}; // 배열 초기화 방법
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
         */
        System.out.println("new연산자를 이용한 배열 정의");
        String[] bts = new String[7];
        bts[0]="진";
        bts[1]="뷔";
        bts[2]="정국";
        bts[3]="RM";
        bts[4]="지민";
        bts[5]="슈가";
        bts[6]="제이홉";

        System.out.println("배열 요소 출력하기");
        for(int i=0; i<bts.length; i++) {
            System.out.println("bts["+i+"] = "+ bts[i]);
        }
        System.out.println("초기화 기법을 이용한 배열 정의");
        /* String[] bts = {"진", "뷔", "정국", "rm", "지민", "슈가", "제이홉"} ;
        System.out.println("배열 요소 출력하기");
        for (int i = 0; i < bts.length; i++) {
            System.out.println("bts[" + i + "] = " + bts[i]);
         */
    }
}
