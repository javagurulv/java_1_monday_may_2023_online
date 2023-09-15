package lv.javaguru.java1.student_timur_geldiev.lesson_15.homework.lvl_2;

import java.util.concurrent.atomic.AtomicInteger;

class ThreadSafeAtomicIdGenerator {

    private AtomicInteger id = new AtomicInteger(0);

    public int nextId() {
        return id.incrementAndGet();
    }

    public static void main(String[] args) {

        NotThreadSafeIdGenerator idGenerator = new NotThreadSafeIdGenerator();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int id1 = idGenerator.nextId();
                System.out.println("Thread 1: " + id1);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int id2 = idGenerator.nextId();
                System.out.println("Thread 2: " + id2);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                int id3 = idGenerator.nextId();
                System.out.println("Thread 3: " + id3);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        }catch (InterruptedException e){
            System.out.println(e);
        }

    }
}
