package lv.javaguru.java1.student_butrin_ilya.lesson_8.homework.day4;

import java.util.ArrayList;
import java.util.List;

public class millionList {
    public static void main(String[] args) {
        List<Integer> million = new ArrayList<>();
        for(int i = 0; i < 1000000; i++){
            million.add(i);
        }
        System.out.println(million.size());
        List<Long> billion = new ArrayList<>();
        for (long i = 0; i < 1000000000; i++){
        billion.add(i);
    }
        System.out.println(billion.size());
}
}
