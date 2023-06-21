package ch12_stream;

import java.io.*;
import java.nio.Buffer;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class JumsuStream {
    public static void main(String[] args) {
        // strem을 통해 읽어오기 → 데이터 가공 → 총점하고 평균 구하기 → result.com 파일 만들기 → 가공한 데이터 쓰기
        // split이나 StringTokenizer로 ,를 쪼개기 → 문자열 실수값으로 바꾸기 (double을 parseInt 사용) → total=다 더하기 → equalsIgnoreCase() 사용해서 남자/여자로 나누기

        String pathname = System.getProperty("user.dir") + "\\src\\data\\";
        String source = pathname + "jumsu.txt"; // 읽어 들을 파일
        String target = pathname + "result.txt"; // 생성할 파일

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader(new File(source)));
            System.out.println("파일 읽기 종료");

            String oneline="";
            bw = new BufferedWriter(new FileWriter(new File(target)));

            while ((oneline=br.readLine()) !=null){
                String result=makeStr(oneline);
                System.out.println();
                bw.write(result);
                bw.newLine();
                System.out.println(result);
            }
            System.out.println("작업이 완료되었습니다.");

        } catch (FileNotFoundException e) {
            System.out.println(source+"은 존재하지 않는 파일입니다.");
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("입출력 예외가 발생하였습니다.");
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("기타 예외가 발생하였습니다.");
            e.printStackTrace();

        } finally {
            try {
                if(br!=null){br.close();}
                if(bw!=null){bw.close();}

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String makeStr(String oneline) {
        System.out.println(oneline);
        String[] arr=oneline.split(",");

        String name=arr[0];
        double kor=Double.parseDouble(arr[1]);
        double eng=Double.parseDouble(arr[2]);
        double math=Double.parseDouble(arr[3]);
        String gender=arr[4].equalsIgnoreCase("M")?"남자":"여자";

        double _total=kor+eng+math;
        double _average=_total/3;

        String pattern="###.0";
        DecimalFormat df=new DecimalFormat(pattern);
        String total=df.format(_total);
        String average=df.format(_average);

        String result=name+"/"+gender+"/"+total+"/"+average;

        return result;

//        [ StringTokenizer 사용해서 잘라내기 ]
//        String delimiter=",";
//        StringTokenizer st=new StringTokenizer(oneline, delimiter);

//        String name=st.nextToken();
//        double kor=Double.parseDouble(st.nextToken());
//        double eng=Double.parseDouble(st.nextToken());
//        double math=Double.parseDouble(st.nextToken());
//        String gender=st.nextToken().equalsIgnoreCase("M")?"남자":"여자";

//        double _total=kor+eng+math;
//        double _average=_total/3.0;
    }
}


