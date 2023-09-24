package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_8.day_4;

import java.util.ArrayList;
import java.util.List;

class MillionAndBillionObjects {

    public static void main(String[] args) {

        List<Integer> million = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            million.add(i);
        }
        System.out.println("Million objects: ");
        System.out.println(million);

        List<Long> billion = new ArrayList<>();
        for (long i = 0; i < 1000000000; i++) {
            billion.add(i);
        }
        System.out.println("Billion objects: ");
        System.out.println(billion);
    }
}
