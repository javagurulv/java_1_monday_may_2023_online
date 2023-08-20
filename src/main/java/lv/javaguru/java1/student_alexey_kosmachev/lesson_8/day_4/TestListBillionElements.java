package lv.javaguru.java1.student_alexey_kosmachev.lesson_8.day_4;

import java.util.ArrayList;
import java.util.List;


class TestListBillionElements {
    public static void main(String[] args) {
        List<Integer> billionList = new ArrayList<>();
        for (int i = 0; i <= 1000000000; i++) {
            billionList.add((i));
        }

        System.out.println("Длина списка: " + billionList.size());
    }

// Возникает ощибка Java heap space. Добавитьь миллиард элементов не вышло
}
