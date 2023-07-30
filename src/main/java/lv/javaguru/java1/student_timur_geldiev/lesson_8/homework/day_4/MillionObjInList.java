package lv.javaguru.java1.student_timur_geldiev.lesson_8.homework.day_4;

import java.util.ArrayList;
import java.util.List;

public class MillionObjInList {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i <= 1000000; i++){
            integerList.add(i);
        }
        System.out.println(integerList);
    }
}
