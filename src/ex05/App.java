package ex05;

import ex05.teacher.HTMLTeacher;
import ex05.teacher.JavaTeacher;
import ex05.teacher.PythonTeacher;
import ex05.teacher.Teacher;

public class App {
    public static void main(String[] args) {
        Teacher pt = new PythonTeacher();
        pt.수업하기();
        System.out.println("---------------------------------------");

        Teacher jt = new JavaTeacher();
        jt.수업하기();
        System.out.println("---------------------------------------");

        Teacher ht = new HTMLTeacher();
        ht.수업하기();
    }
}
