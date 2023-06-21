package ch12_stream;

import java.io.*;
// *은 everthing,
// 여기서는 all class를 import해라

public class FileWriterEx {
    // 파일에다가 문자열 Stream을 기록하는 중
    //           문자열 스트림   바이트 스트림
    // 읽기       Reader        InputStream
    // 쓰기       Writer        OutputStream
    // Buffer)   메모리의 처리 속도 향상을 위한 보조 스트림

    public static void main(String[] args) {
        // 폴더 구분자 작성시 슬래시는 1개, 역슬래시는 2개로 표현합니다.

        String pathname= System.getProperty("user.dir")+"\\src\\data\\";
        System.out.println(pathname);

        String filename=pathname+"jumsu.txt";
        System.out.println(filename);
        // D:\JavaProject\MyJava\src\data\jumsu.txt는 단순한 문자열

        File target=new File(filename);
        // target에 filename을 넣으면서 target이 파일이 됨

        // FileWriter fw;
        // 메인 메소드 안에 생성한 지역변수는 반드시 초기화해야 한다.
        FileWriter fw=null;
        BufferedWriter bw = null;
        // FileWriter는 Writer의 상속을 받는 관계

        System.out.println("파일을 기록중입니다.");
        try {
            // System.out.println(3/0);
            // ↑ 이렇게 쓰면 안됨(nullpointerException오류가 뜬다.)
            // 왜나하면 try로 들어와서 오류가 생겼기 때문에 fw=new FileWriter(target);와 bw=new BufferedWriter(fw);는 실행되지 않고 catch에 해당하는 오류도 아니기 때문에 finally로 들어간다.
            // nullpointerException : null은 참조 하지 않는 데이터이기 때문에 대략 의미 없는 데이터에 뻘짓하지 마라..라는 의미

            fw=new FileWriter(target);
            bw=new BufferedWriter(fw);
            // ↑ 파일을 오픈한 것, 닫을 때는 클로즈

            // 여기에 파일 기록하기
            bw.write("제시카, 60.0, 70.0, 80.0, F");
            bw.newLine();
            bw.write("홍길동, 50.0, 70.0, 100.0, M");
            bw.newLine();
            bw.write("유재석, 60.0, 70.0, 80.0, M");
            bw.newLine();
            bw.write("티파니, 40.0, 80.0, 50.0, F");

            System.out.println("파일 기록 종료");
        } catch (IOException e) {
            e.printStackTrace();

        }finally {
            try {
                if(bw!=null){bw.close();}
                if(fw!=null){fw.close();}

            } catch (IOException e) {
               e.printStackTrace();
            }
        }
    }
}
