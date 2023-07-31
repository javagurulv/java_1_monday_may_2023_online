package lv.javaguru.java1.student_ainars_belinskis.lesson_8.homework.day_3;


import java.util.ArrayList;
import java.util.List;

//List (список) — это упорядоченный набор объектов, каждый элемент которого занимает определенную позицию в списке.
// Интерфейс List расширяет интерфейс Collection и добавляет в него несколько методов для работы со списками,
// таких как методы доступа к элементам по их положению в списке и методы поиска и сортировки списков.
// List может содержать повторяющиеся элементы, доступ к этим элементам можно получить по их положению в списке.
class Dublicates {
    public static void main(String[] args) {
        List<Integer> dublicates = new ArrayList<>();
        dublicates.add(1);
        dublicates.add(1);
        dublicates.add(2);
        dublicates.add(2);

        System.out.println(dublicates.get(0));
        System.out.println(dublicates.get(1));
        System.out.println(dublicates.get(2));
        System.out.println(dublicates.get(3));
        System.out.println(dublicates);


    }
}
