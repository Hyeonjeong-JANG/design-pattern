package ex10;

// 문제는 이렇게 알람을 켜는 기능을 완성했는데 클라이언트가 불이 켜지는 기능을 추가해달라고 할 경우 발생한다.
public class App {
    public static void main(String[] args) {
//        Command lampCommand = new LampCommand(new Lamp());
//        Command alarmCommand = new AlarmCommand(new Alarm());
//        alarmCommand.execute();
//        lampCommand.execute();
        Command alarmCommand = new AlarmCommand(new Alarm());
        Command lampCommand = new LampCommand(new Lamp());
        Button alarmButton = new Button(alarmCommand);
        Button lampButton = new Button(lampCommand);

        alarmButton.press();
        lampButton.press();
    }
}
