package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_8.homework.day_4;

import java.util.ArrayList;
import java.util.List;

public class MillionObjectListApp {

    public static void main(String[] args) {
        List<Integer> millionObjects = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            millionObjects.add(i);
        }
        System.out.println("Number of objects in the list: " + millionObjects.size());
    }

}



