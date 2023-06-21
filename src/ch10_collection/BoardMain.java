package ch10_collection;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {
    public static void main(String[] args) {
        Board soo=new Board(10, "aaa", "김철수", "2023/01/10", 5);
        Board kim=new Board(9, "bbb", "김유신", "2023/01/05", 3);
        Board yoon=new Board(8, "ccc", "윤봉길", "2023/01/01", 8);

        List<Board> lists=new ArrayList<Board>();
        // 게시물 4개 리스트에 담음
        lists.add(soo);
        lists.add(kim);
        lists.add(yoon);
        lists.add(new Board(7, "ddd", "이순신", "2023/01/01", 4));
        // 일회용 객체생성
        System.out.println("요소의 갯수 : "+lists.size());

        BoardDao dao=new BoardDao();
        // dao : 데이터 베이스에 가서 데이터 가져와
        dao.PushData(lists);

        int size=dao.getSize();
        System.out.println("Dao에서 개수 얻어 오기 : "+size);

        Board choi=new Board(6, "eee", "최우", "2023/01/10", 11);
        dao.InsertData(choi);
        System.out.println("추가된 후 개수 : "+dao.getSize());

        // 10번 글의 조회수를 20으로 변경해주세요
        int no =10; // 글 번호
        int readcount=20; // 변경할 조회수
        dao.UpdateReadCount(no, readcount);

        readcount=10;
        List<Board> greater10=dao.SubStart(readcount);
        if(greater10==null || greater10.size()==0){
            System.out.println("조회수 10개 이상인 데이터 없음");
        }else{
            for (Board bean : greater10) {
                showData(bean);
            }
        }

        List<Board> printdata=dao.SelectAll();
        if(printdata == null){
            System.out.println("목록이 존재하지 않습니다.");
        }else{
            String printTitle="글번호\t제목\t작성자\t작성일자\t조회수";
            System.out.println("방법01) 확장 for를 사용한 출력");
            System.out.println(printTitle);

            for (Board bean:printdata){
                // for 문장 안에 들어있는 지역변수
                  showData(bean);
            }

            System.out.println("방법02) get(숫자) 메소드를 이용한 출력");
            System.out.println(printTitle);
            for (int i = 0; i < printdata.size(); i++) {
                Board bean=printdata.get(i);
                showData(bean);
            }
        }
    }

    private static void showData(Board bean) {
        String SEPARATOR="\t";
        int no=bean.getNo();
        String title=bean.getTitale();
        String writer=bean.getWriter();
        String regdate=bean.getRegdate();
        int readcount=bean.getReadcount();

        String imsi=no+SEPARATOR+title+SEPARATOR+writer+SEPARATOR+regdate+SEPARATOR+readcount;
        System.out.println(imsi);
    }

}
