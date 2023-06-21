package ch10_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Generator extends Thread {
    /* 01) extends Thread
       02) runs + enter (run 메소드 오버라이딩)
       03) Map 메소드 만들기
       04) 생성자(목적 : 개체 생성) 만들기
       05) for 문장 돌리기
       06) run 메소드에 Thread.seep 설정하기
       07) try...catch
       08) random 객체 생성하기
       09) 랜덤 숫자를 맵 안에 넣어야 하는데
       10) containsKey()를 이용해서 랜덤숫자가 맵 안에 있는 숫자인지 확인하기
       11) 들어있는 숫자이면 int newValue=map.get(key)+1 → map.put(key, newValue);
       12) 들어있지 않는 숫자이면 map.put(key, 1);
       13) 결과를 출력하는 메소드 하나 더 만들기
       14) for 문장 돌려서 출력하기
     */
    private Map<Integer, Integer> map = null;

    public Generator() {
        this.map = new HashMap<Integer, Integer>();
    }

    @Override
    public void run (){
        System.out.println("데이터 생성중\n잠시만 기다려 주세요");
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
                int key = new Random().nextInt(10) + 1;
                // System.out.println(key);

                if (map.containsKey(key) == true) {
                    int newValue = map.get(key) + 1;
                    map.put(key, newValue);
                } else {
                    map.put(key, 1);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("데이터가 생성되었습니다.");
        PrintResult();
    }

//    public void run() {
//         Random rand=null;
//         try {
//             rand=new Random();
//             for (int i = 0; i < 101; i++) {
//                 Thread.sleep(100);
//                 int su = rand.nextInt(10) + 1;
//
//                 if(map.containsKey(su)){
//                     map.get(su+1);
//                 }else{
//                     map.put(su, 1);
//                 }
//
//             }
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//
//         } catch (Exception e){
//             e.printStackTrace();
//         }
//     }
     private void PrintResult(){
         System.out.println("해당 결과를 출력합니다.");
         for (int i = 1; i <= 10; i++) {
             int value=map.get(i);
             System.out.println(i+"/"+value);
         }
     }
}
