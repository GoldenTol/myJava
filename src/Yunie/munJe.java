package Yunie;

public class munJe {
    public static void main(String[] args) {
        String 유혜진;
        String 이송민;
        String 임한울;

        유혜진="공실이";
        이송민="둘리";
        임한울="갓파";

        System.out.println("유혜진은 "+유혜진+", 이송민은 "+이송민+", 임한울은 "+임한울);
        System.out.println(유혜진+"와 "+이송민+"와 "+임한울+"는 금요미식회 맴버 입니다.");

        String result="\n유혜진은 ";
        result=result+유혜진;
        result=result+", 이송민은 ";
        result=result+이송민;
        result=result+", 임한울은 ";
        result=result+임한울;
        result=result+"\n";
        result=result+유혜진;
        result=result+"와 ";
        result=result+이송민;
        result=result+"와 ";
        result=result+임한울;
        result=result+"는 금요미식회 맴버 입니다.";
        System.out.println(result);
    }
}

