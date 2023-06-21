package ch04_class;

public class AccountMain04 {
    public static void main(String[] args) {

    Account04 cheolSu=new Account04("김철수", "국민", 1234);
    cheolSu.Display();
        System.out.println();

    Account04 youngHee=new Account04("공영희", "국민", 5678, 2000);
    youngHee.Display();
    }
}
