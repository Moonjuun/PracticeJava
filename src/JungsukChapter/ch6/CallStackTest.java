package JungsukChapter.ch6;
//ex 6-7
//2022-06-13 월

public class CallStackTest {
    public static void main(String[] args){
        firstMethod(); // static 메서드는 객체생성없이 호출가능하다.
    }

    static void firstMethod(){
        secondMethod();
    }

    static void secondMethod(){
        System.out.println("secondMethod()");
    }
}

// main()이 firstMethod()를 호출하고 firstMethod()는 secondMethod()를 호출한다.