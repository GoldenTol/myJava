package ch04_class;

public class Account03 {
    private String name;
    private String bankname;
    private int no;
    private  int balance;

    public void setName(String name){
        this.name=name +"님";
    }
    public void setBankname(String bankname){
        this.bankname=bankname;
    }
    public void setNo(int no){
        this.no=no;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public String getName(){
        return "이름 : "+name;
    }
    public String getBankname(){
        return bankname+"은행";
    }
    public int getNo(){
        return no;
    }
    public String getBalance(){
        String _getBalance="";
        if (balance>=6000){
            _getBalance="많습니다.";
        }else{
            _getBalance="적습니다.";
        }
        String bankBalance=balance+"으로 "+_getBalance;
        return bankBalance;
    }
}
