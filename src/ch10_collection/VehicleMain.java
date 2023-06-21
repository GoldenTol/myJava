package ch10_collection;

import java.util.*;

public class VehicleMain {
    public static void main(String[] args) {
        Map<String, VehicleController> map=new HashMap<>();

        Properties prop=new Properties();
        prop.put("car", "ch10_collection.CarController");
        prop.put("horse", "ch10_collection.HorseController");
        prop.put("airplane", "ch10_collection.AirplaneController");

        Set<Object> keyset=prop.keySet();
        for(Object key:keyset){
            String command=(String)key;
            String className=prop.getProperty(command);

            try{
                Class<?> myobject=Class.forName(className);
                // myobject는 "ch10_collection.CarController"의 객체가 된다.
                VehicleController vechicle=(VehicleController)myobject.newInstance();
                map.put(command, vechicle);

                /* map의 현황
                key        value
                car        CarController의 객체
                horse      HorseController의 객체
                airplane   AirplaneController의 객체
                1 또는 2 또는 3을 넣으면 각 객체가 실행되고 ~가 달립니다.가 출력
                 */
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("메뉴 선택 : 1(car), 2(horse), 3(airplane)");
        Scanner scan=new Scanner(System.in);
        int menu= scan.nextInt();
        String command=null;
        if (menu==1){
            command="car";
        }else if(menu==2){
            command="horse";
        }else if(menu==3){
            command="airplane";
        }else{

        }
        VehicleController action=map.get(command);
        if(action==null){
            System.out.println("잘못된 요청 커멘드입니다.");
        }else{
            action.drive();
        }
    }
}
