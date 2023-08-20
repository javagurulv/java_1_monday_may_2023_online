package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_2;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] dayOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday"};
        return dayOfWeek[number - 1];
    }
}

