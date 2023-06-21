package ch09_thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadEx extends Thread {
    /* 1) 쓰레드 상속 받고 run 오버라이딩 하기
       2) Thread.sleep (원하는 시간)
       3) surround(try...catch)
       4) for문장 돌리기
       5) 메인 메소드에서 객체 생성하기
       6) 메인 메소드에서 객체이름.start();
     */

    public ThreadEx(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(3000);
                Date date=new Date();
                String pattern=super.getName()+"의 쓰레드 시각 : hh시 mm분 ss초";
                SimpleDateFormat sdf=new SimpleDateFormat(pattern);
                String now=sdf.format(date);
                System.out.println(now);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
