package ex02;

public class DoormanProxy extends Doorman {
    public void 쪼까내(Animal a) {
        System.out.println("지갑 검사");
        super.쪼까내(a);
    }
}
