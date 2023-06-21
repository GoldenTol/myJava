package ch05_package_inheritance.Education;

public class Staff extends Person{
    private String division; // 부서 이름

    public Staff(String name, int age, String address, String phone, MemberType type, String division) {
        super(name, age, address, phone, type);
        this.division=division;
    }

    @Override
    public String toString() {
        String imsi="";
        imsi += "부서 : "+this.division+" 부서";
        return super.toString()+imsi;
    }
    public void work(){
        String imsi="직원 "+super.getName()+"이(가) "+this.division+"부서에서 근무합니다.";
        System.out.println(imsi);
    }
}
