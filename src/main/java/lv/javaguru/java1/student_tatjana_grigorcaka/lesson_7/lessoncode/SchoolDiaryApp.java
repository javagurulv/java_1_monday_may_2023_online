package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.lessoncode;

import java.util.List;

public class SchoolDiaryApp {

    public static void main(String[] args) {
       SchoolDairy schoolDiary = new SchoolDairy();
        schoolDiary.addMark(new Mark("Math", 10));
        schoolDiary.addMark(new Mark("Eng", 5));
        schoolDiary.addMark(new Mark("Eng", 6));
        schoolDiary.addMark(new Mark("Math", 6));

        int maxMark = schoolDiary.findMaxMark("Math");

        int maxMark2 = schoolDiary.findMaxMark(
                List.of(
                        new Mark("Math", 10),
                        new Mark("Math", 5)
                )
        );

    }

}
