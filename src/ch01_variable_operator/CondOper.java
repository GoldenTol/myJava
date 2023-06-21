package ch01_variable_operator;

public class CondOper {
    public static void main(String[] args) {
        int x, y, z;
        x = 3;
        y = 8;
        z = 4;
        int mid = x >= y ? x : y;
        int result = mid >= z ? mid : z;
        /* int x, y, z, result;
        x=3;
        y=8;
        z=4;
        result = x > y ? (x > y ? x : z) : (y > x ? y : z);
        */

        System.out.println(x + ", " + y + ", " + z + " 중 최대의 정수는 " + result + "입니다.");

        int min = x <= y ? x : y;
        result = min >= z ? z : min;
        // result = x < y ? (x < z ? x : z) : (y < z ? y : z);

        System.out.println(x + ", " + y + ", " + z + " 중 최소의 정수는 " + result + "입니다.");
    }
}
