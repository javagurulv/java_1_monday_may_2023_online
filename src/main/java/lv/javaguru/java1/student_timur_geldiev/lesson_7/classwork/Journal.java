package lv.javaguru.java1.student_timur_geldiev.lesson_7.classwork;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    public static void main(String[] args) {
        Mark mark1 = new Mark("Math", 4);
        Mark mark2 = new Mark("Eng", 5);
        Mark mark3 = new Mark("Math", 9);

        List<Mark> marks = new ArrayList<>();
        marks.add(mark1);
        marks.add(mark2);
        marks.add(mark3);

        for (int i = 0; i < marks.size(); i++) {
            Mark mark = marks.get(i);

        }
    }

    public List<Mark> findMathMarks(List<Mark> allMarks) {
        List<Mark> mathMarks = new ArrayList<>();
        for (int i = 0; i < allMarks.size(); i++) {
            Mark mark = allMarks.get(i);
            if (mark.getSubject().equals("Math")) {
                mathMarks.add(mark);
            }
        }
        return mathMarks;
    }
}
