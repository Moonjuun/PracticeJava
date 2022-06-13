package HonGongChapter.ch6;
// ex 6-3-2 객체 생성 후 필드값 출력
// 2022-06-13 월

public class KoreanExample {
    public static void main(String[] args){
        Korean k1 = new Korean("김자바", "011225-1234567");
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);

        Korean k2 = new Korean("이자바", "001222-2345678");
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.ssn : " + k2.ssn);
    }
}
