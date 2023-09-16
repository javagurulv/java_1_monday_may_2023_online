package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_8.day_2;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(0, 1);
        integerList.add(1, 2);
        integerList.add(2, 3);
        integerList.add(3, 4);
        integerList.add(4, 5);

        integerList.size();
        System.out.println("Integer list size: " + integerList.size());

        integerList.remove(4);

        boolean isEmpty;
        if (integerList.isEmpty()) {
            isEmpty = true;
        } else {
            isEmpty = false;
        }
        System.out.println("Integer is empty: " + isEmpty);

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println("Integer list size: " + integerList.get(i));
        }
    }
}
