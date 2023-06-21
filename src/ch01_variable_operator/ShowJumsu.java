package ch01_variable_operator;

public class ShowJumsu {
    public static void main(String[] args) {
        String name;
        int languageScore;
        int englishScore;
        int average;

        name="유혜진";
        languageScore=100;
        englishScore=98;
        average=(languageScore+englishScore)/2;


        System.out.println("이름 : " + name);
        System.out.println("국어 : " + languageScore);
        System.out.println("영어 : " + englishScore);
        System.out.println("평균 : " + average);

    }
}
