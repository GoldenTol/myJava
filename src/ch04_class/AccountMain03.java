package ch04_class;

public class AccountMain03 {
    public static void main(String[] args) {
        Account03 gongSil=new Account03();
        Account03 duly=new Account03();
        Account03 gatPa=new Account03();

        gongSil.setName("유혜진");
        gongSil.setBankname("농협");
        gongSil.setNo(1234);
        gongSil.setBalance(9000);
        System.out.println(gongSil.getName());
        System.out.println("주은행 : "+gongSil.getBankname());
        System.out.println("계좌번호 : "+gongSil.getNo());
        System.out.println("예치금 : "+gongSil.getBalance());
        System.out.println();

        duly.setName("이송민");
        duly.setBankname("국민");
        duly.setNo(4567);
        duly.setBalance(6000);
        System.out.println(duly.getName());
        System.out.println("주은행 : "+duly.getBankname());
        System.out.println("계좌번호 : "+duly.getNo());
        System.out.println("예치금 : "+duly.getBalance());
        System.out.println();

        gatPa.setName("임한울");
        gatPa.setBankname("우리");
        gatPa.setNo(7890);
        gatPa.setBalance(4000);
        System.out.println(gatPa.getName());
        System.out.println("주은행 : "+gatPa.getBankname());
        System.out.println("계좌번호 : "+gatPa.getNo());
        System.out.println("예치금 : "+gatPa.getBalance());
    }
}
