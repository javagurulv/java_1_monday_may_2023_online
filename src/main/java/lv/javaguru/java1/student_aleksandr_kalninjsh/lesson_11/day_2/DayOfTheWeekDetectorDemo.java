package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_11.day_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {

    public DayOfTheWeekDetector day;
    public DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector day) {
        this.detector = day;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 7");
        int number = scanner.nextInt();
        String result = detector.detectDayName(number);
        System.out.println(result);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetector detector1 = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo demo1 = new DayOfTheWeekDetectorDemo(detector1);
        DayOfTheWeekDetector detector2 = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorDemo demo2 = new DayOfTheWeekDetectorDemo(detector2);
        DayOfTheWeekDetector detector3 = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo demo3 = new DayOfTheWeekDetectorDemo(detector3);

        demo1.run();
        demo2.run();
        demo3.run();
    }
}
