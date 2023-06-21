package ch06_abstract_interface.sportTest;

public abstract class Sport {
    private String name;
    private  int entry;

    public Sport(String name, int entry){
        this.name=name;
        this.entry=entry;
    }
    public abstract void Display();
    public void Display2(){
        System.out.println("종목 이름 : "+this.name);
        System.out.println("엔트리 : "+this.entry);
    }
}

