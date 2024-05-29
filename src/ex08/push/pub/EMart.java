package ex08.push.pub;

import ex08.push.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class EMart implements Mart {

    private List<Customer> customerList = new ArrayList<>(); // 구독자 명단

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void received() { // received가 while이 걸린다는 것은 선이 연결되어있다는 뜻이야. 근데 지금은 while이 걸려 있지 않다.
        for (int i = 0; i < 15; i++) {
            System.out.println(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // 5초 지나면 알림 줘야 함.
        notify("EMart: 딸기");
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
