package ch11_lambda_expression.model;

public class Saram {
    private String id; // 아이디
    private String name; // 이름
    private int kor; // 국어
    private int eng; // 영어
    private int math; // 수학

    public Saram() {}

    public Saram(String id, String name, int kor, int eng, int math) {
        this.id = id;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }
}
