package lv.javaguru.java1.student_timur_geldiev.lesson_8.homework.day_2;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        integerList.add(0, 4);

        integerList.remove(3);

        integerList.remove(Integer.valueOf(1));

//        integerList.clear();

        int listSize = integerList.size();

        boolean isEmpty;
        if (integerList.isEmpty()) {
            isEmpty = true;
        } else {
            isEmpty = false;
        }
        System.out.println("Is List empty? - " + isEmpty);
        System.out.println("List size is - " + listSize);


        for (int i = 0; i < integerList.size(); i++) {
            int value = integerList.get(i);
            System.out.println(value);
        }


    }

}
