package ex02;

public class App {
    public static void main(String[] args) {
        Animal mouse = new Mouse();
        Animal tiger = new Tiger();
        DoormanProxy doorman = new DoormanProxy();
        doorman.쪼까내(tiger);
    }
}
