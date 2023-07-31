package lv.javaguru.java1.student_butrin_ilya.lesson_8.homework.day2;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integerListDemo = new ArrayList<>();
        integerListDemo.add(1);
        integerListDemo.add(2);
        integerListDemo.add(3);
        integerListDemo.add(4);
        integerListDemo.add(5);
        integerListDemo.add(6);
        int size = integerListDemo.size();
        integerListDemo.add(7);
        integerListDemo.add(0, 0);
        integerListDemo.remove(3);
        boolean isEmpty = integerListDemo.isEmpty();
        for (int i = 1; i < integerListDemo.size(); i++) {
            System.out.println(integerListDemo.get(i));
        }
        System.out.println(size + " " + isEmpty);
    }
}