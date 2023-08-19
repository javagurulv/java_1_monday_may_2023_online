package lv.javaguru.java1.student_alexey_kosmachev.lesson_8.day_3;

import java.util.ArrayList;
import java.util.List;

public class TestListStringDuplicates {

    public static void main(String[] args) {

        List<String> string = new ArrayList<>();
            string.add("Alexey");
            string.add("Alexey");
            string.add("Alexey");
            string.add("Alexey");
            string.add("Alexey");

            System.out.println("Список чисел: " + string);
    }
    //Список может включать одинаковые эдементы ввиде строк.
}
