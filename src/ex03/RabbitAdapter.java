package ex03;

import ex03.lib.OuterRabbit;

/**
 * 문제가 뭐냐? 다른 애들은 겟네임인데 토끼는 겟풀네임이다. 어째야하지? OCP를 지켜야 하기 때문에 코드를 수정할 수는 없어!!!
 */

public class RabbitAdapter extends Animal {
    private OuterRabbit outerRabbit; // 1. 아우터 래빗을 만들고

    public RabbitAdapter(OuterRabbit outerRabbit) { // 2. 전달받음
        this.outerRabbit = outerRabbit;
    }

    @Override
    public String getName() {
        return outerRabbit.getFullname(); // 3. 이렇게 쏙 집어넣으면 됨.
    }
}
