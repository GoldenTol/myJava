package ch10_collection;

import java.util.Enumeration;
import java.util.Properties;

public class MyPropertyExam {
    public static void main(String[] args) {
        Properties prop=new Properties();
        prop.put("id", "hong");
        // = String id="hong";
        prop.put("name", "홍길동");
        prop.put("password", "1234");
        prop.put("address", "마포구 공덕동");
        prop.put("zipcode", "123-456");

        String id=prop.getProperty("id");
        System.out.println("아이디 : "+id);
        // 급여(salary)가 존재하는지 확인해보세요.
        String salary= prop.getProperty("salary", "100");
        System.out.println("급여 : "+salary);
        // 20원 인상된 급여를 출력해보세요.
        Integer newSalary=Integer.parseInt(salary)+20;
        System.out.println("새급여 : "+newSalary);
        // 휴대폰(handphone)이 존재하지 않으면, 신규 추가해 보세요.
        if(prop.getProperty("handphone")==null){
            prop.put("handphone", "01011112222");
        }
        String hphone= prop.getProperty("handphone");
        System.out.println("핸드폰 : "+hphone);

        System.out.println("요소개수 : "+prop.size());

        Enumeration enu=prop.propertyNames();
        // System.out.println(enu.toString());
        while (enu.hasMoreElements()){ // 원소가 더 있니?
            String property=(String) enu.nextElement();
            System.out.println(property);
        }
        System.out.println();
        Enumeration enu2= prop.keys();
        // propertyNames();와 prop.keys();가 비슷해보이지만..
        while (enu2.hasMoreElements()){
            // nextElement()와 getProperty()를 사용하여 :대신에 /로 구분하여 출력을 출력해 보세요.
            String property=(String) enu2.nextElement();
            String value=prop.getProperty(property);
            System.out.println(property+"/"+value);
        }
    }
}
