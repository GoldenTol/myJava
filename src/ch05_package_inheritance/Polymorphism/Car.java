package ch05_package_inheritance.Polymorphism;

public class Car {
    private String name; // 차량 이름
    private int price; // 가격

    public Car(){ // 2. 상속 받은 서브 클래스에 매개 변수가 없는 생성자가 호출되기 때문에 수퍼 클래스에 매개 변수 없는 생성자는 없고 매개 변수 2개있는 생성자만 있을 경우 오류가 뜬다. 사용 하든 안하든 항상 만들어 두는 습관을 들이자
    }
    public Car(String name, int price) {
        // 3. 매개 변수 2개의 생성자
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}
