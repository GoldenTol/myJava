package ch09_thread;

class Some2{}
public class Atm extends Some2 implements Runnable{
    private int balance;

    public Atm(int balance){
        this.balance=balance;
        System.out.println("최초 금액 : "+balance+"원");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(1000);
                // 최소 50원, 최대 100원 범위 내에서 인출하기
                int money=(int) (100.0*Math.random()+50.0);

                if(this.balance>=money){
                    this.withdraw(money); // 인출하기
                }else{
                    Thread who=Thread.currentThread();
                    String name=who.getName();
                    System.out.println("잔액이 부족");
                    System.out.println(name+"이(가) "+money+"원 인출 실패");
                    String imsi="현재 잔액 : "+balance;
                    imsi +=", 인출 요구액 : "+money+"\n";
                    System.out.println(imsi);
                    return;
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private synchronized void withdraw(int money){ // 인출하는 메소드
        this.balance -= money;

        Thread who=Thread.currentThread();
        String name=who.getName();
        System.out.println(name+"이(가) "+money+"원 인출하여 통장 잔액이 "+balance+"원 입니다.\n");
    }
}
