package lv.javaguru.java1.student_timur_geldiev.lesson_15.homework.lvl_2;

class NotThreadSafeIdGenerator {

    private int id;
    private boolean even;

    public synchronized int nextId() {
        id++;
        this.even = isEven(id);
        return id;
    }

    public boolean isEven() {
        return this.even;
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        NotThreadSafeIdGenerator idGenerator = new NotThreadSafeIdGenerator();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    int id1 = idGenerator.nextId();
                    boolean even1 = idGenerator.isEven(id1);
                    if (id1 % 2 == 0 && even1) {
                        System.out.println("Thread 1: id=" + id1 + ", even=" + even1);
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    int id2 = idGenerator.nextId();
                    boolean even2 = idGenerator.isEven(id2);
                    if (id2 % 2 == 0 && even2) {
                        System.out.println("Thread 2: id=" + id2 + ", even=" + even2);
                    }
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    int id3 = idGenerator.nextId();
                    boolean even3 = idGenerator.isEven(id3);
                    if (id3 % 2 == 0 && even3) {
                        System.out.println("Thread 3: id=" + id3 + ", even=" + even3);
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}