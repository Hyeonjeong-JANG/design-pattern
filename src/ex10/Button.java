package ex10;

public class Button {
    // 버튼은 알람이 있어야지만 작동할 수 있다.
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}
