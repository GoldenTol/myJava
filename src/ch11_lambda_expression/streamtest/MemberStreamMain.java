package ch11_lambda_expression.streamtest;

import ch11_lambda_expression.model.DataCollection;
import ch11_lambda_expression.model.Gender;
import ch11_lambda_expression.model.Member;

import java.util.List;

public class MemberStreamMain {
    public static void main(String[] args) {
        List<Member> list= DataCollection.getMemberList();
        System.out.printf("요소 개수 : "+list.size());

        System.out.printf("\n전체 목록 출력하기\n");
        list.stream().forEach(member-> System.out.println(member));

        System.out.printf("\n남자들만 출력하기\n");
        list.stream().filter(mem->mem.getGender()== Gender.MALE).forEach(member-> System.out.println(member));

        String address="마포";
        System.out.println("\n주소지가 "+address+"인 회원들 출력하기");
        list.stream().filter(mem->mem.getAddress()==address).forEach(member-> System.out.println(member));

        int age=40;
        System.out.println("\n나이가 "+age+"이하인 회원들 출력하기");
        list.stream().filter(mem->mem.getAge()<=40).forEach(member-> System.out.println(member));

        String startAddress="용";
        System.out.println("\n주소지가 '"+startAddress+"'으로 시작하는 회원들 출력하기");
        list.stream().filter(mem->mem.getAddress().startsWith(startAddress)).forEach(member-> System.out.println(member));
    }
}
