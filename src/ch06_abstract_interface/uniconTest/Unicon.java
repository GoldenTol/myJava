package ch06_abstract_interface.uniconTest;

public class Unicon implements Horse, Bird{
    private String name;
    private String gender;
    private int initspeed; // 초기 속도
    
    public Unicon(String name, String gender) {
        this.name=name;
        this.gender=gender;
        if(gender == "M"){
            this.initspeed=Bird.speed;
        }else{
            this.initspeed=Horse.speed;
        }
    }
// 일반적인 구현체 메소드를 콘크리트 메소드라고 합니다.
    public void Display() {
        String imsi="%s의 초기 속도는 %d입니다.\n";
        System.out.printf(imsi, this.name, this.initspeed);
        this.run();
        this.fly();
    }
    @Override
    public void run() {
        String imsi="%s은(는) 최대 %d의 속도로 달릴 수 있습니다.\n";
        System.out.printf(imsi, this.name, Horse.speed);
    }
    @Override
    public void fly() {
        String imsi="%s은(는) 최대 %d의 속도로 날아갈 수 있습니다.\n";
        System.out.printf(imsi, this.name, Bird.speed);
    }
}
