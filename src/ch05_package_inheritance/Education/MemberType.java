package ch05_package_inheritance.Education;

public enum MemberType {
    STUDENT("학생"), TEACHER("선생님"), STAFF("직원");

    private String name;

    private MemberType(String name) {
        this.name=name;
    }
    public String getname(){
        return name;
    }
}
