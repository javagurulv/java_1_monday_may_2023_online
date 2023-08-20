package lv.javaguru.java1.student_alexey_kosmachev.lesson_8.day_4;

import java.util.ArrayList;
import java.util.List;

class TestListMillionElements {

    public static void main(String[] args) {

        List<Integer> millionList = new ArrayList<>();
        for (int i = 0; i <= 1000000; i++) {
            millionList.add((i));
        }

        System.out.println("Длина списка: " + millionList.size());
    }

// список из миллиона элементов успешно создается
}
