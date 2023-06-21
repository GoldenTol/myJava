package ch02_control_statement;

public class For01 {
    public static void main(String[] args) {
        int total = 0;

        for(int i = 1; i < 11; i++){
        // System.out.println(i);
        /* 초기식 : int i=1
           조건식 : i <= 10 || i<11
           증감식 : i = i+1 || i++ || ++i
        */
        total += i;
        }
        System.out.println("총합1 : "+total);

        total = 0;

        for(int i = 1; i < 101; i += 3){
            total += i;
        }
        System.out.println("총합2 : "+total);

        total = 0;
        for(int i = 97; i > 1; i -= 5){
            total  += i;
        }
        System.out.println("총합3 : "+total);

        total = 0;
        for(int i = 1; i < 97; i += 5) {
            total += i * i; // total = total + i * i
        }
        System.out.println("총합4 : "+total);

        total = 0;
        for(int i = 1; i < 6; i++) {
            total += i * (i++);
        }
        System.out.println("총합5 : "+total);

    } //여기서 반복이 끝나 증감식으로 돌아간다. → 조건식이 충족되지 않으면 반복하지 않고 빠져나간다.
}
