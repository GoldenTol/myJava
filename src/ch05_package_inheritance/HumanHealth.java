package ch05_package_inheritance;

public class HumanHealth {
    public static void main(String[] args) {
        Health hong=new Health("홍길동", "M", 175.3, 95.45);
//        hong.output1();
        System.out.println("\n");
        Health park=new Health("박영희", "F", 162.3, 52.45);
//        System.out.println("이름 : "+hong.getName());
    }
}
