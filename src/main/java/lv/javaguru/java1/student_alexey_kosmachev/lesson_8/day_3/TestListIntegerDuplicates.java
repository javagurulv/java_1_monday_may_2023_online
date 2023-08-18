package lv.javaguru.java1.student_alexey_kosmachev.lesson_8.day_3;

import java.util.ArrayList;
import java.util.List;

class TestListIntegerDuplicates {

    public static void main(String[] args) {

        List<Integer> integer = new ArrayList<>();
        integer.add(1);
        integer.add(1);
        integer.add(1);
        integer.add(1);
        integer.add(1);

        System.out.println("Список чисел: " + integer);
    }

    // В списке могут храниться одинаковые числовые элементы
}
