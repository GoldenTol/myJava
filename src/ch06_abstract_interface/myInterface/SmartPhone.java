package ch06_abstract_interface.myInterface;

public class SmartPhone extends Pda implements MobilePhone, Mp3{
    private String phoneNo;
    private String songName;
    private String munja;

    public SmartPhone(String phoneNo, String songName) {
        this.phoneNo = phoneNo;
        this.songName = songName;
        this.munja="잘 있었니?";
    }
//    public String getPhoneNo{
//        return phoneNo;
//    }
//    public String getSongName{
//        return songName;
//    }
    @Override
    public boolean sendCall(int no) {
        return false;
    }

    @Override
    public boolean receiveCall(int no2) {
        return false;
    }

    @Override
    public boolean sendSMS(String message) {
        return false;
    }

    @Override
    public boolean receiveSMS(String message2){
        return false;
    }

    @Override
    public void play(String[] manysong) {
        System.out.println("여러 곡 재생하기");
        for (int i = 0; i < songName.length(); i++) {
            System.out.println(manysong[i]+"번째 노래"+"'"+songName+"'"+" 재생");
        }
    }
    @Override
    public void stop() {
        System.out.println(this.songName+"를(을) 재생 중지합니다.");
    }
}

