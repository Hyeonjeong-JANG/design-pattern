package ex06.notification;

public class EmailNotifier implements Notifier {
    private Notifier notifier;

    public EmailNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public EmailNotifier() {
    }

    // 재정의
    public void send() {
        if (notifier != null) notifier.send(); // 기능을 확장하는 것이기 때문에 집어 넣은 객체를 먼저 선실행되게 한다.
        System.out.println("이메일 알림");
    }
}
