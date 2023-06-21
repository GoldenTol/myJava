package ch07_utility_classes.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMain03 {
    public static void main(String[] args) throws Exception{
        String className="ch07_utility_classes.classex.Human";
        Class myClass=Class.forName(className);

        System.out.println("모든 생성자 정보");
        Constructor[] arrContruct=myClass.getConstructors();
        for (Constructor cont:arrContruct){
            System.out.println(cont);
        }
        System.out.println();
        System.out.println("모든 필드 정보(public 접근 지정자만 O.K)");

        Field[] fields=myClass.getFields();
        for (Field f:fields){
            System.out.println(f);
        }
        System.out.println();
        System.out.println("모든 메소드 정보");
        Method[] methods=myClass.getMethods();
        for (Method m:methods){
            System.out.println(m);
        }
    }
}
