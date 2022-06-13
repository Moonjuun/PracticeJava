package HonGongChapter.ch6;
// ex 6-3-2 생성자에서 필드 초기화
// 2022-06-13 월

public class Korean {
    //필드
    String nation = "대한민국";
    String name;
    String ssn;

    //생성자
    public Korean(String n, String s){
        name = n;
        ssn = s;
    }
}
