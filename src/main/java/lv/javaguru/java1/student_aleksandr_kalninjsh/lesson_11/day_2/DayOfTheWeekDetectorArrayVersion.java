package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_11.day_2;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String dayOfTheWeek[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return dayOfTheWeek[number - 1];
    }
}
