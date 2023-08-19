package lv.javaguru.java1.student_timur_geldiev.lesson_11.homework.day_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector day;
    private DayOfTheWeekDetector detector;
    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector day){
        this.detector = day;
    }

    void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number in range 1-7");
        int number = sc.nextInt();
        String result = detector.detectDayName(number);
        System.out.println(result);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetector detector1 = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo demo1 = new DayOfTheWeekDetectorDemo(detector1);
        DayOfTheWeekDetector detector2 = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorDemo demo2 = new DayOfTheWeekDetectorDemo(detector2);
        DayOfTheWeekDetector detector3 = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo demo3 = new DayOfTheWeekDetectorDemo(detector3);

        demo1.run();
        demo2.run();
        demo3.run();



    }

}
