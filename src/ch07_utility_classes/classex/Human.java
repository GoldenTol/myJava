package ch07_utility_classes.classex;

public class Human {
    public String name; // 이름
    private String address; // 주소
    private int age; // 나이

    public Human(){
    }

    public Human(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        String imsi="";
        imsi += "이름 : "+this.name;
        imsi += ", 주소 : "+this.address;
        imsi += ", 나이 : "+this.age;
        return imsi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
