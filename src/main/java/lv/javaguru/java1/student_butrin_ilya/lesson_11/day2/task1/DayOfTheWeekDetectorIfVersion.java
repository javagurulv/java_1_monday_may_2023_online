package lv.javaguru.java1.student_butrin_ilya.lesson_11.day2.task1;

import lv.javaguru.java1.student_butrin_ilya.lesson_11.day2.task1.DayOfTheWeekDetector;

public class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector {

    // Try to use switch here!!
    @Override
    public String detectDayName(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}