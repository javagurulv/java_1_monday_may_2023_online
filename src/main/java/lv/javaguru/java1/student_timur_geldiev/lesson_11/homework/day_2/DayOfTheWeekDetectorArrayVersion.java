package lv.javaguru.java1.student_timur_geldiev.lesson_11.homework.day_2;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] dayArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (number >= 1 && number <= 7) {
            return dayArray[number - 1];
        } else {
            return "Enter value between 1-7";
        }

    }
}
