package ch11_lambda_expression.streamtest;

import ch11_lambda_expression.model.DataCollection;

import java.util.Arrays;
import java.util.List;

public class FlatMapMain {
    public static void main(String[] args) {
        List<String> list01= DataCollection.getManyStringTest01();
        list01.stream()
                .flatMap(data-> Arrays.stream(data.split("")))
                .forEach(word-> System.out.println(word));

        List<String> list02= DataCollection.getManyStringTest02();
        list02.stream()
                .flatMapToInt(data->{
                    String[] strArr=data.split(",");
                    int[] intArr=new int[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        intArr[i]=Integer.parseInt(strArr[i].trim()); // trim : 양 쪽 공백제거
                    }
                    return Arrays.stream(intArr);
                }).forEach(number-> System.out.println(number));

    }
}
