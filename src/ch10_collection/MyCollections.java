package ch10_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyCollections {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<Integer>();
        for (int i = 1; i < 20; i+=3) {
            list1.add(i);
        }
        System.out.println(list1.toString());

        int key=10; // 찾고자 하는 데이터
        int index=Collections.binarySearch(list1, key); // binary : 2진 탐색법
        System.out.println("탐색의 반환 값 : "+index);
        System.out.println("즉, "+(index+1)+"번째 요소입니다.");
        System.out.println("값 읽기 : "+list1.get(index));

        int startVal=1;
        int endVal=10;
        List<Integer> list2=new ArrayList<Integer>();
        for (int i = startVal; i <= endVal; i++) {
            list2.add(i);
        }
        System.out.println(list2.toString());

        Collections.shuffle(list2);
        System.out.println(startVal+"부터 "+endVal+"까지 랜덤하게 섞기");
        System.out.println(list2.toString());

        Student[] array={
                new Student(202302, "홍길동"),
                new Student(202304, "박영희"),
                new Student(202301, "강감찬"),
                new Student(202303, "김철수")
        };
        // new로 객체4개를 선언하는데 "array"로 묶어서 배열해놓음
        List<Student> studentList= Arrays.asList(array);
        Collections.sort(studentList);
        System.out.println("오름차순 정렬 : "+studentList.toString());

        Collections.sort(studentList, Collections.reverseOrder());
        System.out.println("내림차순 정렬 : "+studentList.toString());

        List<Student02> student02List=new ArrayList<Student02>();
        student02List.add(new Student02("홍길동", 1, 1));
        student02List.add(new Student02("심윤진", 1, 2));
        student02List.add(new Student02("김진혁", 2, 1));
        student02List.add(new Student02("공재숙", 2, 2));

        Collections.sort(studentList);
        System.out.println("오름차순 정렬02 : "+student02List.toString());

        Collections.sort(studentList, Collections.reverseOrder());
        System.out.println("내림차순 정렬02 : "+student02List.toString());
    }
}
