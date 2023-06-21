package ch11_lambda_expression.streamtest;

import ch11_lambda_expression.model.DataCollection;
import ch11_lambda_expression.model.Member;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingMain {
    public static void main(String[] args) {
        int[] arr=DataCollection.getArrayData03();
        IntStream arrData= Arrays.stream(arr);
        System.out.println("\n배열 요소 오름차순으로 정렬하기");
        arrData.sorted().forEach(su-> System.out.println(su));

//        System.out.println("\n배열 요소 내림차순으로 정렬하기");
//        arrData.sorted().forEach(su-> System.out.println(su));

        System.out.println("\n 우선Member 클래스에 대하여 Comparable 인터페이스를 구현하도록 합니다.");
        List<Member> list= DataCollection.getMemberList();

        System.out.println("\n오름차순으로 정렬하기");
        list.stream().sorted().forEach(mem-> System.out.println(mem));

        System.out.println("\n마포 거주자들에 대한 오름차순으로 정렬하기");
        list.stream().filter(mem->mem.getAddress().equals("마포")).sorted().forEach(mem-> System.out.println(mem));

        System.out.println("\n내림차순으로 정렬하기");
        list.stream().sorted(Comparator.reverseOrder()).forEach(mem -> System.out.println(mem));
    }
}
