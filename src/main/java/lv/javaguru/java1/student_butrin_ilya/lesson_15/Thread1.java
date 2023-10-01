package lv.javaguru.java1.student_butrin_ilya.lesson_15;

public class Thread1 implements Runnable {
    NotThreadSafeIdGenerator count;

    public Thread1(NotThreadSafeIdGenerator count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            count.nextId();
            if ((count.getId() % 2 == 0 && !count.isEven())
                    || count.getId() % 2 == 1 && count.isEven()) {
                System.out.println(count.getId() + "  " + count.isEven());
            }
        }}}
         /*   count.isEven();
            if (count.getId() % 2 == 0 && !count.isEven()) {
                System.out.println(count.getId());
                System.out.println(count.isEven());
            } */
