package ch11_lambda_expression.streamtest;

import ch11_lambda_expression.model.DataCollection;
import ch11_lambda_expression.model.Member;

import java.util.Arrays;
import java.util.List;

public class MatchMain {
    public static void main(String[] args) {
        int[] intArr= DataCollection.getArrayData02();

        int chk01=10;
        boolean bool01=Arrays.stream(intArr).allMatch(su->su%chk01==0);
        System.out.println("모두 "+chk01+"의 배수인가요 = "+bool01);

        int chk02=20;
        boolean bool02=Arrays.stream(intArr).allMatch(su->su%chk02==0);
        System.out.println("모두 "+chk02+"의 배수인가요 = "+bool02);

        int chk03=20;
        boolean bool03=Arrays.stream(intArr).anyMatch(su->su%chk03==0);
        System.out.println(""+chk03+"의 배수가 적어도 1개 이상인가요 = "+bool03);

        int chk04=11;
        boolean bool04=Arrays.stream(intArr).anyMatch(su->su%chk04==0);
        System.out.println(""+chk04+"의 배수가 적어도 1개 이상인가요인가요 = "+bool04);

        int chk05=11;
        boolean bool05=Arrays.stream(intArr).noneMatch(su->su%chk05==0);
        System.out.println(""+chk05+"의 배수가 없나요 = "+bool05);

        int chk06=20;
        boolean bool06=Arrays.stream(intArr).noneMatch(su->su%chk06==0);
        System.out.println(""+chk06+"의 배수가 없나요 = "+bool06);

        List<Member> list=DataCollection.getMemberList();
        int age01=30;
        boolean bool07=list.stream().allMatch(mem->mem.getAge()>=age01);
        System.out.println("모든 사람은 "+age01+"세 이상인가요 = "+bool07);

        boolean bool08=list.stream().anyMatch(mem->mem.getAge()>=age01);
        System.out.println(""+age01+"세 이상인 사람이 존재하나요 = "+bool08);

        String addr="서대문";
        boolean bool09=list.stream().anyMatch(mem->mem.getAddress().equals(addr));
        System.out.println("'서대문'에 거주하시는 분이 있나요 = "+bool09);
    }
}
