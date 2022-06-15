package HonGongChapter.ch6;

import javax.xml.crypto.Data;
class Data1{int x;}
// 2022-06-15
// 예제 6-14 참조형 반환타입

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data1 d = new Data1();
        d.x =10;

        Data1 d2 = copy(d);
        System.out.println("d.x = "+d.x);
        System.out.println("d2.x = "+d2.x);
        }

        static Data1 copy (Data1 d){
            Data1 tmp = new Data1();
            tmp.x = d.x;

            return tmp;
        }
}
