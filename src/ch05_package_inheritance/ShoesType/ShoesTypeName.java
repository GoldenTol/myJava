package ch05_package_inheritance.ShoesType;

// 한글도 동시에 표현하기
public enum ShoesTypeName {
    WALKING("워킹화"), RUNNING("런닝화"), TRACKING("트래킹화"), HIKING("등산화");
    // ()가 생성자 역할을 하기 때문에 매개 변수1개짜리 생성자 호출이 필요하다.

    private String name;

    private ShoesTypeName(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
