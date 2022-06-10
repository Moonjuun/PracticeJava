package JungsukChapter.ch6;
// 예제 6-1

public class Tv {
    //Tv의 속성(멤버변수)
    String color;   //색상
    boolean power;   //전원상태(on/off)
    int channel;    //채널

    //TV의 기능
    void power() {power = !power;} // TV를 켜거나 끄는 기능의 메서드
    void channelUp() {++channel;} // TV의 채널을 올리는 기능의 메서드
    void channelDown() {--channel;} // TV의 채널을 내리는 기능의 메서드
}

class TvTest {
    public static void main(String args[]){
        Tv t;               //Tv인스턴스를 참조하기 위한 변수 t를 선언
        t = new Tv();       //Tv인스턴스 생성
        t.channel = 7;      //Tv인스턴스의 멤버버변수 channel의 값을 7로 한다.
        t.channelDown();    //Tv인스턴스의 메서드 channelDown(()을 호출
        System.out.println("현재 채널은" + t.channel+ "입니다");
    }

}