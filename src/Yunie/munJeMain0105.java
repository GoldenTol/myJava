package Yunie;

public class munJeMain0105 {
    public static void main(String[] args) {
        munJe0105 minJeong  = new  munJe0105();
        munJe0105 sukHee = new munJe0105();
        munJe0105 kilI = new munJe0105();
        munJe0105 gangIn = new munJe0105();

        minJeong.name="최민정";
        minJeong.juminno=980909.2;
        minJeong.bankname="국민은행";
        minJeong.no=1234;
        minJeong.balance=10000;
        minJeong.Display1();
        int juminnoInfo=2;
        String message = minJeong.genderInfo(juminnoInfo);
        System.out.println(message);
        minJeong.Display2();
        System.out.println();

        sukHee.name="심석희";
        sukHee.juminno=970130.2;
        sukHee.bankname="농협은행";
        sukHee.no=2345;
        sukHee.balance=9000;
        sukHee.Display1();
        juminnoInfo=2;
        message = minJeong.genderInfo(juminnoInfo);
        System.out.println(message);
        sukHee.Display2();
        System.out.println();

        kilI.name="김길리";
        kilI.juminno=040701.4;
        kilI.bankname="신한은행";
        kilI.no=3456;
        kilI.balance=6000;
        kilI.Display1();
        juminnoInfo=4;
        message = minJeong.genderInfo(juminnoInfo);
        System.out.println(message);
        kilI.Display2();
        System.out.println();

        gangIn.name="이강인";
        gangIn.juminno=010219.3;
        gangIn.bankname="기업은행";
        gangIn.no=4567;
        gangIn.balance=8000;
        gangIn.Display1();
        juminnoInfo=1;
        message = minJeong.genderInfo(juminnoInfo);
        System.out.println(message);
        gangIn.Display2();
        System.out.println();

        munJe0105[] athlete=new munJe0105[4];
//        athlete[0].name="최민정";
//        athlete[1].name="심석희";
//        athlete[2].name="김길리";
//        athlete[3].name="이강인";

//        for (int i=0; i<athlete.length; i++) {
//            athlete[i]=new munJe0105[];
//            athlete[0].name = "최민정";
//            athlete[1].name = "심석희";
//            athlete[2].name = "김길리";
//            athlete[3].name = "이강인";
//
//            System.out.println(athlete[i]+"선수");
//          }
//        for (int i = 0; i <athlete.length; i++) {
//            athlete[i].Display1();
//            athlete[i].Display2();
//        }
    }
}
