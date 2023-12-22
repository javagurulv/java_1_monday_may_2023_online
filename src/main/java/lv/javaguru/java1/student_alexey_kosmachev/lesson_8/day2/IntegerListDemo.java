package lv.javaguru.java1.student_alexey_kosmachev.lesson_8.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IntegerListDemo {

        public static boolean isEmpty(Collection<?> collection) {

            return collection == null || collection.isEmpty();
        }
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
            integers.add(1);
            integers.add(2);
            integers.add(12);
            integers.add(22);
            integers.add(37);

        System.out.println("Список чисел: " + integers);

            integers.add(0,0);

        System.out.println("0 в начале списка: " + integers);

            integers.add(100);

        System.out.println("100 в конце списка: " + integers);
        System.out.println("Длина списка: " + integers.size());

            integers.remove(5);

        System.out.println("Удаляем число с индексом 5: " + integers);


        System.out.println("Удаляем число не по индексу: " + integers);

        boolean isEmpty = isEmpty(integers);
        if (isEmpty) {
            System.out.println("Список пуст");
        } else {
            System.out.println("Список содержит элементы");
        }

        for (int i = 0; i < integers.size(); i++) {
            System.out.println("Выводятся все элементы списка: " + integers.get(i));
        }
    }

}





