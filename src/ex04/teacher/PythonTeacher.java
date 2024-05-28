package ex04.teacher;

/**
 * 이렇게 하면 OCP는 지켰지만 DIP를 지키지 못한 것이다. 추상화 시키지 않았어.
 * 그럼 어떻게 하면 되냐? 공통된 메서드들은 공통으로 쓰고 파이썬강의하기만 추상클래스를 만들어서 따로 만들어서 쓴다.
 */
public class PythonTeacher extends Teacher {
    @Override
    public void 강의하기() {
        System.out.println("파이썬 강의하기");
    }
}
