package ch11_lambda_expression.streamtest;

import ch11_lambda_expression.model.DataCollection;
import ch11_lambda_expression.model.Gender;
import ch11_lambda_expression.model.Member;

import java.util.List;

public class FilteringMain {
    public static void main(String[] args) {
        List<String> namelist= DataCollection.getNameStringList();
        System.out.println("\n동명 이인은 1건으로 표시(중복 배제_distinct)");
        namelist.stream().distinct().forEach(saram-> System.out.println(saram));

        String lastname="김";
        System.out.println("\n'"+lastname+"'씨 성을 가진 사람만 조회하기");
        namelist.stream().filter(saram->saram.startsWith(lastname)).forEach(saram-> System.out.println(saram));

        System.out.println("\n'"+lastname+"'씨 성을 가진 사람만 조회하기(중복 배제)");
        namelist.stream().distinct().filter(saram->saram.startsWith(lastname)).forEach(saram-> System.out.println(saram));

        String finddata="유";
        System.out.println("\n이름에 '"+finddata+"'가 포함되어 있는 사람만 조회하기");
        namelist.stream().filter(saram->saram.indexOf(finddata)>-1).forEach(saram-> System.out.println(saram));

        List<Member> list=DataCollection.getMemberList();
        String finddata02="유";
        System.out.println("\n이름에 '"+finddata02+"'가 포함되어 있는 사람만 조회하기");
        list.stream().filter(human->human.getName().indexOf(finddata02)>-1).forEach(human->System.out.println(human));

        Gender gender=Gender.FEMALE;
        System.out.println("\n성별이 '"+gender+"'인 사람 조회하기");
        list.stream().filter(human->human.getGender()==gender).forEach(human->System.out.println(human));

        String finddata03="천";
        System.out.println("'\n거주지가 '"+finddata03+"'으로 끝나는 사람만 조회하기");
        list.stream().filter(human->human.getAddress().endsWith(finddata03)).forEach(human->System.out.println(human));
    }
}
