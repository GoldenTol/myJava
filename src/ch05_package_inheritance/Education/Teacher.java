package ch05_package_inheritance.Education;

import java.util.Arrays;

public class Teacher extends Person{
    private String[] subjects; // 강의 과목을 저장하고 있는 배열

    public Teacher(String name, int age, String address, String phone, MemberType type, String[] subject) {
        super(name, age, address, phone, type);
        this.subjects=subject;
    }
    @Override
    public String toString() {
        String imsi ="";
        imsi +="강의 과목 리스트\n";
        // 배열은 참조 자료형이기 때문에 배열 이름만 호출하면 @가 나온다. 천상 for문장 돌려야 함
        for (int i = 0; i < this.subjects.length; i++) {
            if(i == (this.subjects.length-1)) {
                imsi += "강의 과목" + (i + 1) + " : " + subjects[i];
            }else {
                imsi += "강의 과목" + (i + 1) + " : " + subjects[i] + "\n";
            }
        }
        return super.toString()+imsi;
    }

    public void teach(){
        String message="%S 선생님은 %d 과목의 강의가 가능합니다.";
        System.out.printf(message, super.getName(), this.subjects.length);
    }
}
