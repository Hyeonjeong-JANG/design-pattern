package ex02;

public class DoormanProxy2 {
    private final Doorman doorman; // final이 붙으면 반드시 매개변수가 있는 상태로 초기화 시켜야 하기 때문에 빈생성자를 만들면 오류가 난다.

    public DoormanProxy2(Doorman doorman) {
        this.doorman = doorman;
    }


    public void 쪼까내(Animal a) {
        System.out.println("지갑 검사");
        doorman.쪼까내(a);
    }
}
