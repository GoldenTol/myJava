package ch07_utility_classes;

public class MyDateMain {
    public static void main(String[] args) {
        MyDate date1=new MyDate(2022, 8, 3);
        MyDate date2=new MyDate(2022, 8, 3);

        if(date1 == date2){
            System.out.println("same instance");
        }else{
            System.out.println("different instance");
        }
        // equals 메소드는 내용 비교를 위한 용도로 설계되었습니다.
        // 하지만, 클래스마다 조금 다르게 동작할 수 있으니 각 클래스의 특징을 잘 살펴 볼 필요가 있습니다.
        if(date1.equals(date2)){
            System.out.println("equals true");
        }else{
            System.out.println("equals false");
        }

        // date1=date2;코드에 의하여 date1은 date2와 동일한 참조를 가지게 됩니다.
        date1=date2;
        if(date1 == date2){
            System.out.println("same instance");
        }else{
            System.out.println("different instance");
        }

        String Korea1=new String("대한민국");
        String Korea2=new String("대한민국");
        if(Korea1 == Korea2){
            System.out.println("String equals true");
        }else{
            System.out.println("String equals false");
        }
    }
}
