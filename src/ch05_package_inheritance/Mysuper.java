package ch05_package_inheritance;

public class Mysuper {
    // = public class Mysuper (extends Object) { extends Object가 숨어있는거기 때문에 수퍼 클래스이자 서브 클래스가 된다.
    int x=100;
    private String hello="안녕하세요.";

    public void sayhello(String name, String age){
        String message=this.hello+""+name+"님."+age+"세";
    }
}
