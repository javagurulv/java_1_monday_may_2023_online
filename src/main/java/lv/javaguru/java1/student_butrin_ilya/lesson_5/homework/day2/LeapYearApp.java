package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day2;

public class LeapYearApp {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        for(int i = 2000; i < 2024; i++) {
            System.out.println("Does " + i + " year is leap? " + leapYear.checkYearIsleap(i));
        }

    }
}
