package lv.javaguru.java1.student_butrin_ilya.lesson_15;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread2 implements Runnable {
    public Thread2(ThreadSafeAtomicIdGenerator count) {
        this.count = count;
    }
    ThreadSafeAtomicIdGenerator count;
    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            count.nextId();
            if ((count.getId() % 2 == 0 && !count.getIsEven())
                    ) {
             System.out.println(count.getId() + "  " + count.getIsEven());
            }
        }

    }
}
