package lv.javaguru.java1.student_butrin_ilya.lesson_15;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeIdGeneratorApp {
    public static void main(String[] args) {
        ThreadSafeAtomicIdGenerator atomic = new ThreadSafeAtomicIdGenerator(new AtomicInteger(0));
       Thread th1 = new Thread(new Thread2(atomic));
        Thread th2 = new Thread(new Thread2(atomic));
        Thread th3 = new Thread(new Thread2(atomic));
       th1.start();
        th2.start();
        th3.start();
        try {
          th1.join();
            th2.join();
            th3.join();

        } catch (InterruptedException e) {
        }
        System.out.println(atomic.getId());}

    }

