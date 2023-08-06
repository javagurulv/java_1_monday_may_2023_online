package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_8.homework.day_2;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> integerList1 = new ArrayList<>();

        integerList1.add(0, 1);
        integerList1.add(1, 2);
        integerList1.add(2, 3);
        integerList1.add(3, 4);
        integerList1.add(4, 5);

        integerList1.add(0, 5);
        integerList1.add(5, 6);

        integerList1.remove(5);

        integerList1.size();
        System.out.println("Integer List size: " + integerList1.size());

        boolean isEmpty;
        if (integerList1.isEmpty()) {
            isEmpty = true;
        } else {
            isEmpty = false;
        }
        System.out.println("Integer List empty: " + isEmpty);


        for (int i = 0; i < integerList1.size(); i++) {
            System.out.println(integerList1.get(i));
        }
    }
}
