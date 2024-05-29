package ex08.push.pub;

import ex08.push.sub.Customer;

public interface Mart {
    // 1. 구독(구독자 등록)
    void add(Customer customer);

    // 2. 출판(축구 동영상 업로드)
    void received();

    // 3. 알림(구독자에게 알림) // 알림 메서드 내부의 구현은 등록 게시판을 다 뒤져서 쏴주는 것이다.
    void notify(String msg);

    // 4. 구독 취소(있어도 되고 없어도 되고)
    void remove(Customer customer);
}
