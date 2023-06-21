package ch10_collection;

// 게시물 객체 1개를 생성하기 위한 클래스로써, 웹에서 Bean 클래스라고 부릅니다.
public class Board {
    // Bean 클래스 안에 들어있는 인스턴스 변수
    private int no; // 글 번호
    private String titale; // 제목
    private String writer; // 작성자
    private String regdate; // 작성일자
    private int readcount; // 조회수

    public Board(){}

    public Board(int no, String titale, String writer, String regdate, int readcount) {
        this.no = no;
        this.titale = titale;
        this.writer = writer;
        this.regdate = regdate;
        this.readcount = readcount;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitale() {
        return titale;
    }

    public void setTitale(String titale) {
        this.titale = titale;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public int getReadcount() {
        return readcount;
    }

    public void setReadcount(int readcount) {
        this.readcount = readcount;
    }
}
