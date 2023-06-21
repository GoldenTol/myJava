package ch10_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MyList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        // 문자열과 정수를 아우를 수 있는 Object
        //List<String> : Generic, 특정 타입(여기서는 String)외에는 들어갈 수 없게 제한하는 것

        list.add("bigbang");
        list.add("2ne1");
        list.add("wonder");
        list.add("kara");
        list.add("2ne1");

        int idx=-1;
        idx=list.indexOf("2ne1");
        System.out.println(idx);
        idx=list.lastIndexOf("2ne1");
        System.out.println(idx);
        idx=list.indexOf("girls");
        System.out.println(idx);

        if(list.indexOf("girls")==-1){
            list.add(2, "girls");
            System.out.println(list);
        }
        System.out.println("확장 for를 이용한 출력");
        for(String item:list){
            System.out.println(item);
        }
        list.set(5, "2am");
        list.remove("wonder");

        System.out.println("get(숫자) 메소드를 이용한 출력");
        String imsi="";
        for (int i = 0; i < list.size(); i++) {
            imsi += list.get(i)+"\t";
        }
        System.out.println(imsi);

        System.out.println("오름차순 정렬");
        Collections.sort(list);
        System.out.println(list.toString());

        System.out.println("내림차순 정렬");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.toString());

        System.out.println("요소 섞기");
        Collections.shuffle(list);
        System.out.println(list.toString());

        List<String> newlist=list.subList(2, 4);
        System.out.println(newlist.toString());

        List<String> totallist=new ArrayList<String>();
        List<String> first=list.subList(1, 3);
        List<String> second=list.subList(4, 5);

        totallist.addAll(first);
        totallist.addAll(second);
        System.out.println(totallist.toString());
        System.out.println("요소 크기 : "+list.size());
    }
}
