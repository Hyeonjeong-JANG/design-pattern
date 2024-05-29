package ex08.push.sub;

public class Customer2 implements Customer {

    @Override
    public void update(String msg) {
        System.out.println("손님2가 받은 알림: " + msg);
    }
}
