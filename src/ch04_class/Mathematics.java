package ch04_class;

public class Mathematics {
    public static String first="첫번째";

    public String second="두번째";

    public static int max(int x, int y){ // 인스턴스 메소드
        int result=x>y?x:y;
        return result;
    }
    public static int max2(int x, int y){
        if (x>y){
            if (x<0) {
                x = -x;
            } else if (y<0) {
                y=-y;
            }
        }else if(x<y){
            if(y<0) {
                y = -y;
            } else if (x<x) {
                x=-x;
            }
        }
        int result2=x>y?x:y;
        return result2;
    }
    public int min(int x, int y) {
        int result = x < y ? x : y;
        return result;
    }
    public static int min2(int x, int y){
        if (x<y){
            if (x<0) {
                x = -x;
            } else if (y<0) {
                y=-y;
            }
        }else if(x>y){
            if(y<0) {
                y = -y;
            } else if (x<x) {
                x=-x;
            }
        }
        int result2=x<y?x:y;
        return result2;
    }
//    public static int abs(int x, int y) {
//        if (x<0 || y<0) {
//            x = -x;
//            y = -y;
//        }else{
//            x=x;
//            y=y;
//        }
//        return result;
//    }
    public static int abs2(int y) {
        if (y < 0) {
            y = -y;
        } else {
            y = y;
        }
        return y;
    }
}
