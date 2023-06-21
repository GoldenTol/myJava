package ch05_package_inheritance.Nopolymorphism;

public class Person {
    private String name; // 차주 이름
    private Tico tico;
    // has a 관계 Person이 Tico를 가지고 있습니다.
    // 인스턴스 변수의 타입도 맴버 변수가 될 수 있다.
    private Spark spark;
    private Cube cube;
    double tax=0.0; // 세금
    String fuelComment="";

    public Person(String name) {
        this.name = name;
    }

    public void ride(Tico tico) { // 메소드
        this.tico=tico;
        System.out.println("차주 : "+this.name);
        System.out.println("가격 : "+this.tico.getPrice()+"원");
        System.out.println("차량 : "+this.tico.getName()+" 시승");
        System.out.println("코멘트 : "+this.tico.getComment());

        this.calcTax(this.tico.getPrice());
        System.out.println("세금 : "+this.tax+"원");
    }
    public void ride(Spark spark) { // 메소드
        this.spark=spark;
        System.out.println("차주 : "+this.name);
        System.out.println("가격 : "+this.spark.getPrice()+"원");
        System.out.println("차량 : "+this.spark.getName()+" 시승");
        System.out.println("메이커 : "+this.spark.getMaker());

        this.calcTax(this.spark.getPrice());
        System.out.println("세금 : "+this.tax+"원");
    }
    public void ride(Cube cube) { // 메소드
        this.cube=cube;
        System.out.println("차주 : "+this.name);
        System.out.println("가격 : "+this.cube.getPrice()+"원");
        System.out.println("차량 : "+this.cube.getName()+" 시승");
        System.out.println("연비 : "+this.cube.getFuel());
        System.out.println("연비 멘트 : "+this.cube.getFuelComment());

        this.calcTax(this.cube.getPrice());
        System.out.println("세금 : "+this.tax+"원"); // private void calcTax(int price) {}가 private로 CarMain에서 접근할 수 없기 때문에 ride 메소드가 불려갈 때 같이 불려갈 수 있도록 만듬
    }
//    public void calcTaxInfo(){
//        this.calcTax(this.cube.getPrice());
//        System.out.println("세금 : "+this.tax+"원");
//    }
    private void calcTax(int price) {
        this.tax=price>150?0.10*price:0.05*price;
    }
//    private void fuelComment(double fuel){
//        if (cube.getFuel() >= 20){
//            fuelComment="excellent";
//        } else if (cube.getFuel() >= 15) {
//            fuelComment="good";
//        }else{
//            fuelComment="poor";
//        }
//    }
}
