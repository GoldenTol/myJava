package ch11_lambda_expression.model;

public class Human {
    private String name;
    private int age;

    public Human() {}

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
