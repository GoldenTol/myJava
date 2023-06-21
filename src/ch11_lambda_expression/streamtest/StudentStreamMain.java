package ch11_lambda_expression.streamtest;

import ch11_lambda_expression.model.DataCollection;
import ch11_lambda_expression.model.Student;

import java.util.List;
import java.util.stream.Stream;

public class StudentStreamMain {
    public static void main(String[] args) {
        List<Student> list= DataCollection.getStudentList();
        Stream<Student> stuStream=list.stream();
        stuStream.forEach(student->{
            String name=student.getName();
            int kor=student.getKor();
            String message="이름 : %s, 국어 : %d\n";
            System.out.printf(message, name, kor);
        });

        double korAvg=list.stream().mapToInt(Student::getKor).average().getAsDouble();
        // dot연산자를 연속적으로 이용하여 메소드 체인이 이루어지는 중
        System.out.println("국어 평균 점수 : "+korAvg);
    }
}
