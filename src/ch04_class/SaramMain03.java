package ch04_class;

public class SaramMain03 {
    public static void main(String[] args) {
        Saram03 yusin=new Saram03();

        yusin.setName("김유신");
        yusin.setHeight(172.6);
        yusin.setWeight(75.3);
        System.out.println(yusin.getName());
        System.out.println("키 : "+yusin.getHeight());
        System.out.println("몸무게 : "+yusin.getWeight()+"kg");
    }
}
