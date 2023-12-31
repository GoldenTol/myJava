package ch12_stream;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

public class GetInfoFolder {
    public static void main(String[] args) {
        String pathname= System.getProperty("user.dir")+"\\src\\data\\";
        System.out.println(pathname);

        // File) 파일이나 폴더를 다루기 위한 클래스입니다.
        // 파일 혹은 폴더의 존재 유무에 상관없이 객체는 무조건 생성이 됩니다.
        File target=new File(pathname);
        // 파일 객체로 만듬
        System.out.println(target);

        if(target.exists()){
            // exists : 해당 객체의 존재여부 확인용
            System.out.println("존재하는 객체");

            if(target.isDirectory()){
                System.out.println("폴더입니다.");
                System.out.println("listFiles 메소드는 목록을 File 배열 형식으로 반환합니다.");

                File[] filelist=target.listFiles();
                System.out.println("목록개수 : "+filelist.length);
                System.out.println("목록 보여 주기");

                for (int i = 0; i < filelist.length; i++) {
                    if(filelist[i].isFile()){
                        // 자바에서 beV가 나오면 무조건 반환타입이 boolean
                        // getName() 메소드는 [파일] 이름만 출력합니다.
                        System.out.println("파일 : "+filelist[i].getName());

                        if(filelist[i].getName().toLowerCase().equals("aa.txt")){
                            System.out.println("파일 aa.txt 파일 정보 출력");
                            System.out.println("절대 경로 : "+filelist[i].getAbsolutePath());
                            System.out.println("파일 크기 : "+filelist[i].length());
                            System.out.println("숨긴 파일인가요? : "+filelist[i].isHidden());
                            System.out.println("마지막 수정 일자 : "+filelist[i].lastModified());
                            System.out.println("실행 가능한 파일인가요? : "+filelist[i].canExecute());
                            System.out.println();
                        }

                    }else{
                        // toString() 메소드는 [전체 경로 + 파일] 이름을 출력합니다.
                        System.out.println("폴더 : "+filelist[i].toString());

                        if(filelist[i].getName().toLowerCase().equals("folder01")){
                            System.out.println("폴더 이름 변경하기");
                            String oldName="folder01";
                            String newName="temp";
                            boolean isReName=filelist[i].renameTo(new File(pathname+"\\temp"));
                            if(isReName){
                                System.out.println("before : "+oldName+", after : "+newName);
                            }
                        }
                    }
                }
                // "bb.txt"파일이 존재하면 삭제, 존재하지 않으면 신규 생성하기
                // File 생성자(전체경로, 파일)
                File bbFile=new File(pathname, "bb.txt");
                if(bbFile.exists()){ // 존재하면 삭제하기
                    System.out.println("존재");
                    boolean isDeleted=bbFile.delete();
                    if(isDeleted){
                        System.out.println(bbFile.getName()+"파일 삭제 성공");
                    }else{
                        System.out.println(bbFile.getName()+"파일 삭제 실패");
                    }
                }else{ // 존재하지 않으면 신규 생성
                    try {
                        System.out.println("존재하지 않음");
                        boolean isCreated=bbFile.createNewFile();
                        if(isCreated){
                            System.out.println(bbFile.getName()+"파일 생성 성공");
                        }else{
                            System.out.println(bbFile.getName()+"파일 생성 실패");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("존재안함");
                }
            }else{
                System.out.println("파일입니다.");
            }
            // 폴더 많이 만들었다가 지우기 다시 만들고 지우기
            for (int i = 1; i < 1000; i++) {
                String filename="folder "+new DecimalFormat("000").format(i);
                System.out.println(filename);
                File newFolder=new File(pathname, filename);
                if(!newFolder.exists()){
                    boolean isMake=newFolder.mkdir();
                    if(isMake){
                        System.out.println(filename+" 폴더 생성 성공");
                    }else{
                        System.out.println(filename+" 폴더 생성 실패");
                    }
                }else{
                    boolean isDeleted=newFolder.delete();
                    if(isDeleted){
                        System.out.println(newFolder.getName()+"파일 삭제 성공");
                    }else{
                        System.out.println(newFolder.getName()+"파일 삭제 실패");
                    }
                }
            }

        }else{
            System.out.println("존재하지 않는 객체");
        }
    }
}
