package lv.javaguru.java1.student_ainars_belinskis.lesson_8.homework.day_2;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7, 7);
        integerList.add(8, 8);
        integerList.remove(8);

        System.out.println("IntegerList size is: " + integerList.size());

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }

            boolean listIsEmpty;
            if (integerList.isEmpty()) {
                listIsEmpty = true;
            } else {
                listIsEmpty = false;
            }
            System.out.println("IntegerList is empty: " + listIsEmpty);

        }

}
