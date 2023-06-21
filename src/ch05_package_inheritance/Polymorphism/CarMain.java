package ch05_package_inheritance.Polymorphism;


public class CarMain {
    public static void main(String[] args) {
        Person soo=new Person("김철수");
        Car car=null;
        car=new Tico("티코", 100, "너무 쪼맨해요~~");
        // Car 수퍼 = Tico 서브
        soo.ride(car);
        System.out.println("===============");
        Person hee=new Person("박영희");
        car=new Spark("스파크", 200, "GM 대우");
        hee.ride(car);
        System.out.println("===============");
        Person minsik=new Person("최민식");
        car=new Cube("큐브", 300, 24.1);
        hee.ride(car);
        System.out.println("===============");
        System.out.println("new 연산자를 이용한 기법");
        //타입[] 배열이름 = new 타입[개수];
        Car[] carlist = new Car[3]; // 배열 정의
        carlist[0]=new Tico("티코2", 400, "단종ㅠㅠ");
        carlist[1]=new Spark("스파크2", 500, "현대");
        carlist[2]=new Cube("큐브2", 600, 13.5);

        for (int i = 0; i < carlist.length; i++) {
            soo.ride(carlist[i]);
            System.out.println("===============");
        }
        System.out.println("===============");
        System.out.println("배열 초기화 기법");
        Car[] cararray={
                new Tico("티코3", 700, "고고씽"),
                new Spark("스파크3", 800, "룰루랄라"),
                new Cube("큐브3", 900, 15.8)
        };
        for (int i = 0; i < cararray.length; i++) {
            hee.ride(cararray[i]);
            System.out.println("===============");
        }
    }
}
