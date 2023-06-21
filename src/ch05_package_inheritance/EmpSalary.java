package ch05_package_inheritance;

public class EmpSalary {
    public static void main(String[] args) {
        System.out.println("대표 이사 이름 : "+Employee.ceoName);
        Employee hong=new Employee("홍길동", 10000, "영업");
        hong.Display();

        Employee hee=new Employee("박영희", 10000, "구매");
        hee.Display();

        Employee soo=new Employee("김철수", "광고");
        soo.Display();
    }
}
