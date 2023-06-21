package ch04_class;

public class Account01 {
    String bankname, name;
    int no, balance;

    String showDisposit() {
        String deposit = "";
        if (balance >= 1500) {
            deposit = "많은 예치금이 있습니다.";
        } else {
            deposit = "적은 예치금이 있습니다.";
        }
        String result=name + "님은 예치금(" + balance + ")으로 "+deposit;
        return result;
    }
}
