package lv.javaguru.java1.student_butrin_ilya.lesson_11.day2.task2;

import lv.javaguru.java1.student_butrin_ilya.lesson_11.day2.task1.DayOfTheWeekDetector;
import lv.javaguru.java1.student_butrin_ilya.lesson_11.day2.task1.DayOfTheWeekDetectorIfVersion;
import lv.javaguru.java1.student_butrin_ilya.lesson_11.day2.task1.DayOfTheWeekDetectorMassivVersion;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    private DayOfTheWeekDetector detector;
    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector day) {
        this.detector = day;
    }
    void run(){
        Scanner scan = new Scanner(System.in);
        int dayOfWeek = scan.nextInt();
        String rezult = detector.detectDayName(dayOfWeek);
        System.out.println(rezult);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo ifVersion = new DayOfTheWeekDetectorDemo(detector);
        ifVersion.run();

    }
}

