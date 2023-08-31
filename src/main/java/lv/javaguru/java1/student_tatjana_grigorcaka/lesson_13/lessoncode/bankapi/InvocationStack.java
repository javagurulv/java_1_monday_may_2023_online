package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_13.lessoncode.bankapi;

public class InvocationStack {

    public static void main(String[] args) {
        m1();
        System.out.println("MAIN");
    }

    public static void m1() {
        m2();
        System.out.println("M1");
    }

    public static void m2() {
        m3();
        System.out.println("M2");
    }

    public static void m3() {
        System.out.println("M3");
    }
}
