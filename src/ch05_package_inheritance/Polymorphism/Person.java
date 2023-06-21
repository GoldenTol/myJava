package ch05_package_inheritance.Polymorphism;

public class Person {
    private String name; // 차주 이름
    private double tax = 0.0; // 세금
    private Car car = null;
//    = private Car car;

    public void ride(Car car) {
        this.car = car;
        System.out.println("차주 : " + this.name);
        int price=this.car.getPrice();
        System.out.println("가격 : " + this.car.getPrice() + "원");
        System.out.println("차량 : " + this.car.getName() + " 시승");


        if (car instanceof Tico) {
            // 승급에 의한 참조 영역의 축소로 comment가 안 보이는데, 강등을 사용하면 접근이 가능합니다.
            Tico mytico = (Tico)car; // 강등
            System.out.println("코멘트 : " + mytico.getComment());

        } else if (car instanceof Spark) {
            Spark myspark=(Spark)car;
            System.out.println("메이커 : "+ myspark.getMaker());
//
        } else if (car instanceof Cube) {
            Cube mycube=(Cube)car;
            System.out.println("연비 : "+mycube.getFuel());
            System.out.println("연비 멘트 : "+mycube.getRemark());
        }
        this.calcTax(price);
        System.out.println("세금 : "+this.tax+"원");
    }
    private void calcTax(int price){
        this.tax=price>=150?0.10*price:0.05*price;
    }

    public Person(String name) {
            this.name = name;
        }
}
