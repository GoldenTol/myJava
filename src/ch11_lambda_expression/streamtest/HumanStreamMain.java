package ch11_lambda_expression.streamtest;

import ch11_lambda_expression.model.DataCollection;
import ch11_lambda_expression.model.Human;

import java.util.List;
import java.util.stream.Stream;

public class HumanStreamMain {
    public static void main(String[] args) {
        List<Human> list= DataCollection.getHumanList();
        Stream<Human> humanStream=list.stream();
        humanStream.forEach(bean->{
            String name= bean.getName();
            int age= bean.getAge();
            String message="이름 : %s, 나이 : %d\n";
            System.out.printf(message, name, age);
        } );

        int ageTotal=list.stream().mapToInt(Human::getAge).sum();
        System.out.println("나이 총합 : "+ageTotal);

        long nameCount=list.stream().count();
        System.out.println("\n인원 수 : "+nameCount);
    }
}
