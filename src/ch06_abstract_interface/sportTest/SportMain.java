package ch06_abstract_interface.sportTest;

public class SportMain {
    public static void main(String[] args) {
        Sport[] sports = {
                new FootBall("축구", 11, 5),
                new BaseBall("야구", 9, 0.345, "good")
        };
        for (int i = 0; i < sports.length; i++) {
            sports[i].Display();
        }
    }
}
