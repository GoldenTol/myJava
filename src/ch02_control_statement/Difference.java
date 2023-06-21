package ch02_control_statement;

public class Difference {
    public static void main(String[] args) {
        int suma = 0, sumb=0;

        for(int i=1; i<51; i++){
            if(i%3 == 0){
                suma += i;
            }else if(i%3 != 0){
                sumb += i;
            }
        }
        int sumc = (suma - sumb)>0 ? suma - sumb : sumb - suma;
        System.out.println("3의 배수의 총합 : "+suma);
        System.out.println("3의 배수가 아닌 정수의 총합 : "+sumb);
        System.out.println("차이 : "+sumc);
    }
}
