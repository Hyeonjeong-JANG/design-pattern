package ex08.push.pub;

import ex08.push.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class LotteMart implements Mart {

    private List<Customer> customerList = new ArrayList<>(); // 구독자 명단

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void received() {
        for (int i = 0; i < 5; i++) {
            System.out.println(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // 5초 지나면 알림 줘야 함.
            notify("바나나");
        }
    }

    @Override
    public void notify(String msg) {
        customerList.forEach(customer -> {
            customer.update(msg); // 정확하게 어떻게 알리고 싶은지 매개변수에 정의됨.
        });
    }

    @Override
    public void remove(Customer customer) {
        customerList.remove(customer);
    }
}
