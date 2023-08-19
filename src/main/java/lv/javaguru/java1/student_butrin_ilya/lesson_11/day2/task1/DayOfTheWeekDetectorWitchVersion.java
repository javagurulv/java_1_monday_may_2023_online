package lv.javaguru.java1.student_butrin_ilya.lesson_11.day2.task1;

import lv.javaguru.java1.student_butrin_ilya.lesson_11.day2.task1.DayOfTheWeekDetector;

public class DayOfTheWeekDetectorWitchVersion implements DayOfTheWeekDetector {
   @Override
   public String detectDayName(int number) {
        String rezult = null;
        switch (number) {
            case 1:
                rezult = "Mondey";
            break;
            case 2:
                rezult = "Tuesday";
            break;
            case 3:
                rezult = "Wednesday";
            break;
            case 4:
                rezult = "Thursday";
            break;
            case 5:
                rezult = "Friday";
            break;
            case 6:
                rezult = "Saturday";
            break;
            case 7:
                rezult = "Sunday";
            break;

        }
        return rezult;
    }
}
