package ch06_abstract_interface.sportTest;

public class FootBall extends Sport{
    private int goal;

    public FootBall(String name, int entry, int goal) {
        super(name, entry);
        this.goal=goal;
        this.message();
    }
    @Override
    public void Display() {
    }
    public void message(){
        super.Display2();
        System.out.println("골 수 : "+this.goal);
        System.out.println("===============");
    }
}
