package lv.javaguru.java1.student_butrin_ilya.lesson_15;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeAtomicIdGenerator {
    public ThreadSafeAtomicIdGenerator(AtomicInteger id) {
        this.id = id;
    }
    private AtomicInteger id;
    private AtomicBoolean isEven;

    public AtomicBoolean getEven() {
        return isEven;
    }

    public int nextId() {
       id.getAndIncrement();
        this.isEven = isEven(id.get());
        return id.get();
    }


    public int getId() {
        return id.get();
    }

   public AtomicBoolean isEven(int id) {
    boolean x = id % 2 == 0;
    AtomicBoolean rezult = new AtomicBoolean(x);
      return rezult;
    }
    public Boolean getIsEven() {
        return isEven.get();
    }
}

