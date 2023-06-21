package ch07_utility_classes;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("12시간제는 1입력, 24시간제는 2입력");
        int menu=scan.nextInt();


        // Calendar now=new Calendar(); // 추상메소드라 new 키워드로 객체생성 못함
        Calendar now=Calendar.getInstance();
        // System.out.println(now);

        // 년, 월, 일, 시, 분, 초  필드라고 한다.
        // 캘린더 객체.get(연관필드)
        int year=now.get(Calendar.YEAR); // ← 전부 다 대문자 enum할 때 했었다.
        int month=now.get(Calendar.MONTH)+1;
        int day=now.get(Calendar.DAY_OF_MONTH); // 달에 며칠 / 주에 며칠 / 년에 며칠

        String sampm="";
        int hour;
        if(menu == 1){ // 12시간제
            int ampm=now.get(Calendar.AM_PM);
            sampm=ampm==0?"오전":"오후";
            System.out.println(sampm);
            hour=now.get(Calendar.HOUR);
        }else{ // 24시간제
            hour=now.get(Calendar.HOUR_OF_DAY);
        }
        int minute=now.get(Calendar.MINUTE);
        int second=now.get(Calendar.SECOND);

        String imsi=year+"년 "+month+"월 "+day+"일 "+sampm+" "+hour+"시 "+minute+"분 "+second+"초";
        String message=year+"년 "+month+"월 "+day+"일 ";
        message += "\n"+hour+"시 "+minute+"분 "+second+"초";
        System.out.println(imsi);
        System.out.println(message);
    }
}
