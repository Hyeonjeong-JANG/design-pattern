package ex10;

import java.util.Scanner;

// 문제는 이렇게 알람을 켜는 기능을 완성했는데 클라이언트가 불이 켜지는 기능을 추가해달라고 할 경우 발생한다.
public class App {
    public static void main(String[] args) {
        // 1. 사용자에게 입력 받기
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();

        // 2. 입력에 따른 버튼 생성(팩토리)
        ButtonFactory factory = ButtonFactory.getInstance();
        Button button = factory.createButton(command);

        // 3. 커멘드 패턴이 적용된 메서드
        button.press();
    }
}
