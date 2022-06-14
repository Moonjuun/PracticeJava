package HonGongChapter.ch6;
// 2022-06-14
// 예제 6-3-3 생성자 오버로딩

public class Car3 {
    // 필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //생성자1
    Car3(){

    }

    Car3(String model){
        this.model = model; // 생성자2
    }

    Car3(String model, String color){ // 생성자3
        this.model = model;
        this.color = color;
    }

    Car3(String model, String color,int maxSpeed){ // 생성자4
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
