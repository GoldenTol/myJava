package ch07_utility_classes;

import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        String str = "소녀시대 빅뱅 원더걸스 exid 걸스데이";

        StringTokenizer str1 = new StringTokenizer(str);
        System.out.println("토큰 갯수 : " + str1.countTokens());

        while (str1.hasMoreTokens()) {
            String item = str1.nextToken();
            System.out.println(item);
        }
        System.out.println();
        str = "소녀시대/빅뱅/원더걸스/exid/걸스데이";
        String delimiter = "/";
        StringTokenizer st2 = new StringTokenizer(str, delimiter);

//        for (int i = 0; i < st2.countTokens(); i++) {
//            String item = st2.nextToken();
//            System.out.println(item);
        while (st2.hasMoreTokens()){
            String item=st2.nextToken();
            System.out.println(item);
        }
        System.out.println();
        str = "소녀시대/빅뱅/원더걸스/exid/걸스데이";
        StringTokenizer str3 = new StringTokenizer(str, delimiter, true);

        while (str3.hasMoreTokens()) {
            String item = str3.nextToken();
            System.out.println(item);
        }
        System.out.println("===============");
        str = "id=hong&password=1234&address=공덕동";
        StringTokenizer str4 = new StringTokenizer(str, "&");
        while(str4.hasMoreTokens()) {
            String item = str4.nextToken();
            StringTokenizer str5 = new StringTokenizer(item, "=");
            while (str5.hasMoreTokens()) {
                System.out.println(str5.nextToken() + "\t");
            }
            System.out.println();
        }
    }
}
