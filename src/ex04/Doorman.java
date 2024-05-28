package ex04;

/**
 * 목적: 문지기를 메모리에 하나만 올리고 싶다.
 */

// 문지기
public class Doorman {
    public static Doorman instance = new Doorman(); // static이 가리키는 변수가(instance)는 static에 저장되고 뉴된 것은 heap에 저장된다.

    private Doorman() {
    }

    public void 쪼까내(Animal a) {
        System.out.println(a.getName() + " 쪼까내");
    }
}
