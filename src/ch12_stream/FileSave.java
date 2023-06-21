package ch12_stream;

import java.io.File;

public class FileSave {
    public static void main(String[] args) {
        String pathname= System.getProperty("user.dir")+"\\src\\data\\";
        String fileTxt=pathname+"file.txt"; // 파일 목록을 저장할 파일
        String folderTxt=pathname+"folder.txt"; // 폴더 목록을 저장할 타입
        String hiddenTxt=pathname+"hidden.txt"; // 폴더 목록을 저장할 타입

        String win_folder = "c:\\windows\\";
        System.out.println(win_folder);

        File target = new File(win_folder);
        System.out.println(target);
        File[] filelist=target.listFiles();

    }
}
