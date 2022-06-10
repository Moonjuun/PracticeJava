package JungsukChapter.ch6;
// 예제6-2
// 예제6-1꺼에서 조금 더 심화

public class Tv2 {
    //Tv의 속성(멤버변수)
    String color;   //색상
    boolean power;   //전원상태(on/off)
    int channel;    //채널

    //TV의 기능
    void power() {power = !power;} // TV를 켜거나 끄는 기능의 메서드
    void channelUp() {++channel;} // TV의 채널을 올리는 기능의 메서드
    void channelDown() {--channel;} // TV의 채널을 내리는 기능의 메서드
}

class TvTest2 {
    public static void main(String args[]){
        Tv t1 = new Tv(); //Tv t1; t1 = new Tv(); 한문장으로 가능
        Tv t2 = new Tv();
        System.out.println("t1의 채널값은" + t1.channel + "입니다.");
        System.out.println("t2의 채널값은" + t2.channel + "입니다.");

        t1.channel = 7; // t1 채널값을 7로 초기화
        System.out.println("t1의 채널값을" + t1.channel + "로 변경하였습니디.");

        System.out.println("현재 t1의 채널값은" + t1.channel + "입니다.");
        System.out.println("현재 t2의 채널값은" + t2.channel + "입니다.");
    }

}