package ch05_package_inheritance.ShoesType;

public class Shoes {
    private String name; // 신발 이름
    private int size; // 사이즈
    ShoesType shoesType;
    private ShoesTypeName shoesTypeName;

    public Shoes(String name, int size, ShoesTypeName shoesTypeName) {
        this.name=name; // 신발 이름
        this.size=size; // 사이즈
        this.shoesTypeName = shoesTypeName;
    }
    public Shoes(String name, int size, ShoesType shoesType) {
        this.name = name;
        this.size = size;
        this.shoesType = shoesType;
    }
    public void Display () {
        System.out.println("신발 이름 : " + this.name);
        System.out.println("신발 크기 " + this.size + "mm");
        System.out.println("신발 코드 : " + this.shoesType);
    }
    public void Display02 () {
        System.out.println("신발 이름 : " + this.name);
        System.out.println("신발 크기 : " + this.size + "mm");
        System.out.println("신발 코드 : " + this.shoesTypeName);
        System.out.println("한글 이름 : " + this.shoesTypeName.getName());
    }
}
