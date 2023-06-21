package ch04_class;

public class AccountMain01 {
    public static void main(String[] args) {
        Account01 cheolSu=new Account01();
        Account01 youngHee;
        youngHee=new Account01();

        cheolSu.bankname="국민은행";
        cheolSu.name="김철수";
        cheolSu.no=1234;
        cheolSu.balance=1000;
        System.out.println("거래은행 : "+cheolSu.bankname);
        System.out.println("예금주 : "+cheolSu.name);
        System.out.println("계좌번호 : "+cheolSu.no);
        System.out.println("예치금 : "+cheolSu.balance);

        String messge=cheolSu.showDisposit();
        System.out.println(messge);
        System.out.println();


        youngHee.bankname="국민은행";
        youngHee.name="박영희";
        youngHee.no=5678;
        youngHee.balance=2000;

        System.out.println("거래은행 : "+youngHee.bankname);
        System.out.println("예금주 : "+youngHee.name);
        System.out.println("계좌번호 : "+youngHee.no);
        System.out.println("예치금 : "+youngHee.balance);

        messge=youngHee.showDisposit();
        System.out.println(messge);
    }
}
