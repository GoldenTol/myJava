package ch01_variable_operator;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int time;
        int hour;
        int minute;
        int second;

        time = 4000;
        hour = time / 3600;
        minute = (time % 3600) / 60;
        second = time % 60;

        System.out.println(time + "초는 " + hour + "시간, " + minute + "분, " + second + "초 입니다.");

        time = 8000;
        hour = time / 3600;
        minute = (time % 3600) / 60;
        second = time % 60;

        System.out.println(time + "초는 " + hour + "시간, " + minute + "분, " + second + "초 입니다.");
    }
}
