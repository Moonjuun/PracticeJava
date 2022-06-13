package JungsukChapter.ch6;
//ex6-8
//2022-06-13 월

public class CallStackTest2 {
    public static void main(String[] args){
        System.out.println("main(String[] args)이 사작되었음");
        firstMethod();
        System.out.println("main(String[] args)이 끝났음");
    }

    static void firstMethod(){
        System.out.println("firstMethod()이 사작되었음");
        secondMethod();
        System.out.println("firstMethod()이 끝났음");
    }

    static void secondMethod(){
        System.out.println("secondMethod()이 사작되었음");
        System.out.println("secondMethod()이 끝났음");
    }
}

// main()이 firstMethod()를 호출하고 firstMethod()는 secondMethod()를 호출한다.