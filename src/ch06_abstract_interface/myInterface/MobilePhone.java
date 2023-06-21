package ch06_abstract_interface.myInterface;

public interface MobilePhone {
    public boolean sendCall(int no);

    public boolean receiveCall(int no2);

    public boolean sendSMS(String message);

    public boolean receiveSMS(String message2);
}