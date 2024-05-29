package ex08.push;

import ex08.push.pub.EMart;
import ex08.push.pub.LotteMart;
import ex08.push.pub.Mart;
import ex08.push.sub.Cus1;
import ex08.push.sub.Cus2;

public class App {
    public static void main(String[] args) {
        // 1. Bean 로드
        Mart lotteMart = new LotteMart();
        Mart eMart = new EMart();
        Cus1 cus1 = new Cus1();
        Cus2 cus2 = new Cus2();

        // 2. 구독
        lotteMart.add(cus1);
        lotteMart.add(cus2);

        eMart.add(cus1);
        eMart.add(cus2);

        // 3. 구독취소
        lotteMart.remove(cus2);

        // 4. 출판
        new Thread(() -> {
            lotteMart.received(); // 출판만 호출하면 트리거가 되어서 노티파이가 호출됨
        }).start();

        new Thread(() -> {
            eMart.received();
        }).start();
        
        // 5. 명시적으로 cus1.update하지 않아도 자동으로 notify가 호출되고 자동으로 customer를 찾아서 호출됨. 이걸 콜백이라고 함.

    }
}
