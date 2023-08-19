package lv.javaguru.java1.student_butrin_ilya.lesson_11.day2.task1;

import lv.javaguru.java1.student_butrin_ilya.lesson_11.day2.task1.DayOfTheWeekDetector;

public class DayOfTheWeekDetectorMassivVersion implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        String rezult = null;
        String[] dayOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday"};
        return dayOfWeek[number + 1];
    }
}
