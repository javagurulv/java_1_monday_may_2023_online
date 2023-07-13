package lv.javaguru.java1.student_timur_geldiev.lesson_6.classwork;

import lv.javaguru.java1.student_timur_geldiev.lesson_5.classwork.TwoNumAverage;

public class TwoNumAverageTest {
    public static void main(String[] args) {

        TwoNumAverageTest test1 = new TwoNumAverageTest();
        test1.shouldFindAverage();
    }

    public void shouldFindAverage() {
        TwoNumAverage check = new TwoNumAverage();
        if (check.findAverage(5, 7) == 6) {
            System.out.println("Test PASS");
        } else {
            System.out.println("Test FAIL");
        }
    }
}
