package ch11_lambda_expression.model;

import org.jetbrains.annotations.NotNull;

public class Member implements Comparable<Member>{
    private String name; // 이름
    private Gender gender; // 성별
    private String address; // 주소
    private int age; // 나이

    public Member() {}

    public Member(String name, Gender gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        String imsi="";
        imsi += "이름 : "+this.name;
        imsi += ", 성별 : "+this.gender;
        imsi += ", 주소 : "+this.address;
        imsi += ". 나이 : "+this.age;
        return imsi;
    }

    @Override
    public int compareTo(@NotNull Member target) {
        // 나이순으로 정렬하되, 같은 나이는 이름으로 정렬하기
        int result=Integer.compare(this.age, target.age);
        if(result==0){
            int test=this.name.compareTo(target.name);
            if(test>0){
                return 1;
            }else if(test<0){
                return -1;
            }else{
                return 0;
            }
        }else{
            return Integer.compare(this.age, target.age);
        }
    }

    public String getName() {return name;}

    public Gender getGender() {return gender;}

    public String getAddress() {return address;}

    public int getAge() {return age;}
}
