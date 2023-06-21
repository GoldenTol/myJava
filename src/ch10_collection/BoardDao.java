package ch10_collection;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    private List<Board> datalist=null;

    public void PushData(List<Board> list){
        // 넘겨진 리스트 컬렉션을 데이터 베이스에 저장해야 합니다.
        System.out.println("데이터 베이스에 추가 요청이 들어 왔습니다.");
        this.datalist=list;
    }
    public int getSize(){
        System.out.println("데이터 개수를 반환해 줍니다.");
        return this.datalist.size();
    }
    public void InsertData(Board bean){
        // Bean 데이터 1개를 추가합니다.
        this.datalist.add(bean);
    }

    public List<Board> SelectAll() {
        // 게시물 전체 목록을 반환해 줍니다.
        return this.datalist;
    }

    public void UpdateReadCount(int no, int readcount) {
        for(Board bean:this.datalist){
            if (bean.getNo()==no){
                int oldreadcount=bean.getReadcount();
                System.out.println("게시물 "+no+"번 글의 조회수가"+oldreadcount+"에서"+readcount+"로 변경되었습니다.");
                bean.setReadcount(readcount);
                break;
            }
        }
    }

    public List<Board> SubStart(int readcount) {
        List<Board> sublist=new ArrayList<Board>();
        for (Board bean:this.datalist){
            if(bean.getReadcount()>=readcount){
                sublist.add(bean);
            }
        }
    return sublist;
    }
}
