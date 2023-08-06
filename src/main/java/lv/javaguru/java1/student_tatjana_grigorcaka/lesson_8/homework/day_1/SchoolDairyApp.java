package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_8.homework.day_1;

import java.util.ArrayList;
import java.util.List;

class SchoolDairyApp {

    public static void main(String[] args) {
        SchoolDairy schoolDairy = new SchoolDairy();
        List<Mark> marks = new ArrayList<>();
        Mark mark1 = new Mark("Math", 10);
        marks.add(mark1);
        Mark mark2 = new Mark("Eng", 7);
        marks.add(mark2);
        Mark mark3 = new Mark("Eng", 7);
        marks.add(mark3);
        Mark mark4 = new Mark("Math", 8);
        marks.add(mark4);


        List<String> subjects = new ArrayList<>();
        subjects.add("Algebra");
        subjects.add("German");
        subjects.add("Geography");


        List<Integer> marks2 = new ArrayList<>();
        marks2.add(10);
        marks2.add(9);
        marks2.add(8);

    }
}
