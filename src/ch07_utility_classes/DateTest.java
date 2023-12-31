package ch07_utility_classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);

        String partern="hh시 mm분 ss초";
        SimpleDateFormat sdf1=new SimpleDateFormat(partern);
        String now=sdf1.format(date);
        System.out.println(now);

        partern="yyyy년 MM月 dd일 hh:mm:ss";
        SimpleDateFormat sdf2=new SimpleDateFormat(partern);
        String curdate=sdf2.format(date);
        System.out.println(curdate);

        partern="오늘은 yyyy년 MM월 dd일이고 E요일이며,";
        partern += "올해 D번째 날이며, w번째 주에 해당합니다.";
        SimpleDateFormat sdf3=new SimpleDateFormat(partern);
        curdate=sdf3.format(date);
        System.out.println(curdate);

        partern="타임존(소문자) : z, 타임존(대문자) : Z, 타임존(대문자 엑스) : X";
        sdf3=new SimpleDateFormat(partern);
        curdate=sdf3.format(date);
        System.out.println(curdate);
    }
}
