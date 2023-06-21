package ch10_collection;

import java.util.HashMap;
import java.util.Map;

public class MyMapExam {
    public static void main(String[] args) {
        Map<String, String> map=new HashMap<String, String>();
        map.put("이름", "홍길동");
        map.put("국어", "60");
        map.put("영어", "80");

        System.out.println("before map");
        System.out.println(map.toString());

        System.out.println("after map");
        System.out.println(map.toString());
    }
}
