package ch04_class;

public class Saram03 {
    private String name;
    private double height;
    private double weight;

    // alt + insert
    public void setName(String name){
        this.name=name+" 님";
    }
    public void setHeight(double height){
        this.height=height;
    }
    public void setWeight(double _weight) {
        weight = _weight;
    }

    public String getName(){
        return "이름 : "+name;
    }
    public String getHeight(){
        String _height = height +" cm";
        return _height;
    }
    public double getWeight(){
        return weight;
    }
}
