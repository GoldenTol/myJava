package ch05_package_inheritance.Nopolymorphism;

public class CarMain {
    public static void main(String[] args) {
        Person soo=new Person("김철수");
        Tico tico=new Tico("티코", 100, "너무 쪼맨해요~~");
        soo.ride(tico);
        System.out.println("===============");
        Person hee=new Person("박영희");
        Spark spark=new Spark("스파크", 200, "GM대우");
        hee.ride(spark);
        System.out.println("===============");
        Person minsik=new Person("최민식");
        Cube cube=new Cube("큐브", 30, 24.1);
        minsik.ride(cube);
//        minsik.calcTaxInfo();
    }
}
