package ch11_lambda_expression.model;

import java.util.Arrays;
import java.util.List;

public class DataCollection {
    public static String[] getArrayData01(){
        return new String[]{"홀길동", "김유식", "이순섭", "강철민"};
    }

    public static int[] getArrayData02() {
        return new int[]{20, 40, 30, 50, 10};
    }

    public static List<String> getNameStringList(){
        return Arrays.asList("홀길동", "김유식", "이순섭", "강철민", "김건우", "김유식");
    }

    public static List<Integer> getIntegerList() {
        return Arrays.asList(22, 44, 33, 55, 11);
    }

    public static List<Student> getStudentList(){
        return Arrays.asList(
                new Student("홍길동", 40, 70, 90),
                new Student("신사임당", 50, 60, 80)
        );
    }

    public static List<Human> getHumanList() {
        return Arrays.asList(
          new Human("홍길동", 40),
          new Human("김철수", 30),
          new Human("박영희", 20)
        );
    }

    public static List<Member> getMemberList() {
        return Arrays.asList(
                new Member("홍길동", Gender.MALE, "마포", 60),
                new Member("이순섭", Gender.MALE, "용산", 20),
                new Member("김현석", Gender.MALE, "금천", 30),
                new Member("윤치호", Gender.MALE, "영등포", 40),
                new Member("김유희", Gender.FEMALE, "마포", 50),
                new Member("강유민", Gender.FEMALE, "용산", 60),
                new Member("심수연", Gender.FEMALE, "금천", 60),
                new Member("강수연", Gender.FEMALE, "영등포", 80)
        );
    }

    public static List<String> getManyStringTest01() {
        return Arrays.asList("java programming is fun", "database beginner");
    }

    public static List<String> getManyStringTest02() {
        return Arrays.asList("11, 22, 33", "44, 55, 66");
    }

    public static int[] getArrayData03(){
        return new int[]{22, 44, 33, 55, 11};
    }
}
