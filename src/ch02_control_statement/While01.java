package ch02_control_statement;

public class While01 {
    public static void main(String[] args) {
        int total=0;
        int i=1; // 초기식
        while(i<11) { //조건식
            total+=i; // 문장
            i++; // 내부에서 증감식 진행
        }
        System.out.println("총합01 : "+total);

        total=0;
        i=1;
        while(i<101) {
            total+=i;
            i+=3;
        }
        System.out.println("총합02 : "+total);

        total=0;
        i=97;
        while(i>1){
            total+=i;
            i-=5;
        }
        System.out.println("총합03 : "+total);

        total=0;
        i=1;
        while(i<97){
            total+=(i*i);
            i+=5;
        }
        System.out.println("총합04 : "+total);
    }
}
