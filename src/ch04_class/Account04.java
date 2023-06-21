package ch04_class;

public class Account04 {
    String name;
    static String bankName="KB";
    int no;
    int balance;

    public Account04(String name, String bankName, int no,  int balance) {
        this.name = name;
        this.no = no;
        this.balance = balance;
    }
    public Account04(String name, String bankName, int no) {
        this.name = name;
        this.no = no;
        this.balance = 100;
    }

    public void Display(){
        System.out.println("예금주 : "+this.name);
        System.out.println("거래 은행 : "+this.bankName);
        System.out.println("계좌번호 : "+this.no);
        System.out.println("예치금 : "+this.balance);
    }

}
