package ch11_lambda_expression.functionalInterface;

public class OperatorMain {
    public static void main(String[] args) {
        int[] array={30, 10, 70, 60, 50};
        OperatorUnit array01=new OperatorUnit(array);
        // 생성자에 배열을 매개 변수로 던져줘 보았다.

        System.out.println("람다식을 이용하여 배열 요소의 최대 값 구하기");
        int max=array01.getMax((left, right)->left>right?left:right);
        System.out.println("배열 요소 최대 값 : "+max);

        // 최소 값 구하는 getMin 작성하기
        System.out.println("람다식을 이용하여 배열 요소의 최소 값 구하기");
        int min=array01.getMin((left, right)->left>right?right:left);
        System.out.println("배열 요소 최소 값 : "+min);

        System.out.println("배열 요소들의 제곱 값");
        int[] newArray=array01.getSquare(item->(item*item));

        for(int item:newArray){
            System.out.println(item+"\t");
        }
        System.out.println();

        double[] celciousArr={25.0, 37.0, 100.0, 1.0};
        OperatorUnit array02=new OperatorUnit(celciousArr);
        System.out.println("섭씨를 화씨로 바꾸기");
        array02.getSumOfMultiple(cel->(cel*1.8)+32.0);
    }
}
