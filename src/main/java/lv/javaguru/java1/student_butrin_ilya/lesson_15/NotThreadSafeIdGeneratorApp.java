package lv.javaguru.java1.student_butrin_ilya.lesson_15;

public class NotThreadSafeIdGeneratorApp {

    public static void main(String[] args) {
        NotThreadSafeIdGenerator no = new NotThreadSafeIdGenerator();
        Thread thread1 = new Thread(new Thread1(no));
        Thread thread2 = new Thread(new Thread1(no));
        Thread thread3 = new Thread(new Thread1(no));
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
        }
        System.out.println(no.getId());

        }
    }


