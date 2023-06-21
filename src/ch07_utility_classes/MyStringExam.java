package ch07_utility_classes;

public class MyStringExam {
    public static void main(String[] args) {
        String str="Lastgodfather";

        int at=str.indexOf("t");
        // indexOf : 단어의 첫번째 포지션을 리턴, lastIndexOf : 뒤에서부터 단어의 포지션을 찾되, 자리수는 앞에서 세서 리턴
        int dt=str.lastIndexOf("t");
        System.out.println("앞쪽 t 위치 : "+at);
        System.out.println("뒤쪽 t 위치 : "+dt);

        String imsi="";
        for (int i=str.indexOf("t")+1; i<str.lastIndexOf("t"); i++) {
            imsi=str.charAt(i)+imsi;
        }
        System.out.println("현재 문자열 : "+str);
        String sequence=str.substring(0,4);
        String sequence2=str.substring(9);
        System.out.println("최종 결과 : "+sequence+"'"+imsi+"'"+sequence2);
        System.out.println("==============================");

        String temp=str.substring(at+1, dt);
        System.out.println("추출된 문자열 : "+temp);
        String message = "";
        for (int i = temp.length()-1; i >=0 ; i--) {
            message += temp.charAt(i);
        // temp.length()-1 의 -1의 이유 : temp는 5개의 글자를 추출 그래서 i는 5가 됐는데 우리가 필요한 부분은 0, 1, 2, 3, 4 이기 때문에 -1
        }
        System.out.println("뒤집힌 문자열 : "+message);
    }
}
