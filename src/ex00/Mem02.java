package ex00;

/**
 * 목표: 다형성, 동적 바인딩 잡기
 * 1. 소나타(오브젝트 == 객체), 제네시스(오브젝트 == 객체) == 자동차(추상)
 */
abstract class Car { // new를 못 함
    abstract void run();
}

class Sonata extends Car {
    @Override
        // 재정의
    void run() {
        System.out.println("소나타 달린다.");
    } // sonata랑 car이 같이 뜸

}

class Genesis extends Car {
    @Override
        // 재정의
    void run() {
        System.out.println("제네시스 달린다.");
    } // genesis랑 car랑 같이 뜸

}

public class Mem02 {
    public static void main(String[] args) {
        Car s = new Sonata(); // 메모리에 Sonata(run)랑 car(run)랑 같이 떠 있기 때문에 Car랑 Sonata 중 아무거나 하나로 부를 수 있어.
        s.run(); // Car의 run을 호출하러 갔더니 소나타(자식)이 run을 재정의해서 Car의 run이 오버라이드(무효화)되고, Sonata의 run이 호출된다.
        Car g = new Genesis(); // 메모리에 Genesis(run)랑 car(run)랑 같이 떠 있기 때문에 Car랑 Genesis 중 아무거나 하나로 부를 수 있어.
        g.run();
    }
}
