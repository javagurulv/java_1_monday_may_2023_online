package lv.javaguru.java1.student_timur_geldiev.lesson_15.homework.lvl_1;

class HelloWorldInTwoThreads {

    public static void main(String[] args) {

        String helloWorld = "Hello World!";

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1: " + helloWorld);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2: " + helloWorld);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 3: " + helloWorld);
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 4: " + helloWorld);
            }
        });
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 5: " + helloWorld);
            }
        });

        long before = System.currentTimeMillis();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        long after = System.currentTimeMillis();

        System.out.println("Time = " + (after - before));

    }
}

