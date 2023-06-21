package ch05_package_inheritance.Education;

public class Person {
    private String name; // 이름
    private int age; // 나이
    private String address; // 주소
    private String phone; // 휴대폰 번호
    private MemberType type; // 직업 유형

    public Person(String name, int age, String address, String phone, MemberType type) {
        this.name=name;
        this.age=age;
        this.address=address;
        this.phone=phone;
        this.type=type;
    }
    public String getName() {
        return name;
    }
    @Override // tos + enter
    public String toString() {
        String imsi="";
        imsi += "이름 : "+this.name+"\n";
        imsi += "나이 : "+this.age+"세"+"\n";
        imsi += "주소 : "+this.address+"\n";
        imsi += "휴대폰 번호 : "+this.phone+"\n";
        imsi += "직업 이름 : "+this.type+"("+this.type.getname()+")"+"\n";
        return imsi;
    }
}


