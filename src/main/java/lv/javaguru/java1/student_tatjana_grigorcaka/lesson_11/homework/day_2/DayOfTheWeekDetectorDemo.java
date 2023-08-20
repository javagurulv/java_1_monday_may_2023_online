package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {

    private DayOfTheWeekDetector day;
    private DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector day) {
        this.detector = day;
    }

    void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number between 1 and 7");
        int dayOfWeek = scan.nextInt();
        String result = detector.detectDayName(dayOfWeek);
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
