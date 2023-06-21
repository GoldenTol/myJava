package ch09_thread;

public class ThreadTest {
    public static void main(String[] args) {
        ThreadEx soo=new ThreadEx("철수");
        soo.start();

        new ThreadEx("영희").start();

        Runnable mrun=new RunnableEx();
        Thread th=new Thread(mrun);
        th.start();
        System.out.println("쓰레드 개수 : "+Thread.activeCount());
        // Thread.activeCount() : 백그라운드에서 돌고 있는 쓰레드가 몇 개인지
    }
}
