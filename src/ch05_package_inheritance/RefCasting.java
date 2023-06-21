package ch05_package_inheritance;

public class RefCasting {
    public static void main(String[] args) {
        // 클래스 이름  객체 이름=new 생성자();
        Object data = new String("하하하");
        String Korea = new String("대한민국");
        Integer jungsu = new Integer(5);
        Book java = new Book("자바", 10000, "kosmo");

        Display(Korea); // Object obj=new String("대한민국");
        Display(jungsu); // Object obj=new Integer(5);
        Display(java); // Object obj=new Book("자바", 10000, "kosmo");
        //  aa((10)); → → → → → → → → → → → → → → → → → → → → → → → → → → → → → ↓
    }   // Book(java) → java=Book → Display(java)=Display(Book) → → → ↓         ↓
        //                                                            ↓         ↓
        // Display(Object obj) = Display(java) = Display(Book)← ← ← ← ↓         ↓
    private static void Display(Object obj){                                 // ↓
                                                                             // ↓
        //  private static void aa(double i){ ← ← ← ← ← ← ← ← ← ← ← ← ← ← ← ← ← ↓
        //        int ddd = (int)3.14 ; → → → → → → → → → → → → → → → → → → → → → → → → → → → ↓
        //    }                                                                               ↓
        //                                                                                    ↓
        // obj 인스턴스가 정수타입(Integer)이 맞나요?                                              ↓
        if(obj instanceof Integer){                                                        // ↓
            Integer su=(Integer) obj;                                                      // ↓
            // Integer이 Object가 되었다가(승급) 다시 Integer이 되었기 때문에(강등) ← ← ← ← ← ← ← ← ← ↓
            System.out.println("정수 : "+su); // 암시적 호출                                 //  ↓
            System.out.println("정수 : "+su.toString()); // 명시적 호출                       // ↓
            // su는 객체, 객체를 프린트 하라는 소리는 객체의 toString을 호출하는것과 같은 소리        // ↓
        } else if (obj instanceof String) {                                                // ↓
            String mystr=(String) obj;                                                     // ↓
            // String이 Object가 되었다가(승급) 다시 String이 되었기 때문에(강등) ← ← ← ← ← ← ← ← ← ←↓
            System.out.println("문자열 : "+mystr);
            System.out.println("문자열 : "+mystr.toString());
        } else if (obj instanceof Book) {
            Book myJava = (Book)obj;
            System.out.println("나의 책 정보 :\n"+myJava.toString());
            System.out.println();

            String name=((Book)obj).getName(); // (Book)obj은 강등 // 한시적으로 북타입으로 바꿔서 이름을 끄집에 내기 위해 인데 보통은 잘 사용 안함
            System.out.println("책이름 : "+name);
            int price=((Book)obj).getPrice();
            System.out.println("단가 : "+price);
            String education=((Book)obj).getEducation();
            System.out.println("교육 기관 : "+education);
        }else{

        }
    }
}