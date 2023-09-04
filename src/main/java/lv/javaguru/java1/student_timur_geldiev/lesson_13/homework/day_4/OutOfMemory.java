package lv.javaguru.java1.student_timur_geldiev.lesson_13.homework.day_4;

import java.util.ArrayList;
import java.util.List;

class OutOfMemory {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        try {
            while (true) {
                integerList.add(1);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemory error exists");
        }
    }
}

