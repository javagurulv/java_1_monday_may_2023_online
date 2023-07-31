package lv.javaguru.java1.student_butrin_ilya.lesson_8.homework.day1;


import lv.javaguru.java1.student_butrin_ilya.lesson_7.classwork.SchoolDiary.Mark;

import java.util.ArrayList;
import java.util.List;

public class listObjectOrInt {
    public static void main(String[] args) {
        List<Integer> integerListDemo = new ArrayList<>();
        integerListDemo.add(1);
        integerListDemo.add(2);
        integerListDemo.add(3);
        integerListDemo.add(4);
        Mark mark = new Mark("mat", 5);
        Mark mark2 = new Mark("eng", 5);
        Mark mark3 = new Mark("mat", 3);
        List<Mark> integerListDemo2 = new ArrayList<>();
        integerListDemo2.add(mark);
        integerListDemo2.add(mark2);
        integerListDemo2.add(mark3);

    }

}
