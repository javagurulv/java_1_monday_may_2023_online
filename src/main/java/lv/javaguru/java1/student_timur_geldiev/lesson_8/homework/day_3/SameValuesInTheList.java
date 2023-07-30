package lv.javaguru.java1.student_timur_geldiev.lesson_8.homework.day_3;

import java.util.ArrayList;
import java.util.List;

public class SameValuesInTheList {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(5);
        integerList.add(5);
        integerList.add(5);
        integerList.add(0);
        integerList.add(0);
        integerList.add(5);
        integerList.add(0);

        System.out.println(integerList);

    }
}
