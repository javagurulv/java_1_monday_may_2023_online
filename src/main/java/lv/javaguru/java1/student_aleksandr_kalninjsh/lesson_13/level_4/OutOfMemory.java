package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_13.level_4;

import java.util.ArrayList;
import java.util.List;

class OutOfMemory {

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();

        try {
            objects.add(1000);
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory error!");
        }
        finally {
            System.out.println("Out of memory error!");
        }
    }
}
