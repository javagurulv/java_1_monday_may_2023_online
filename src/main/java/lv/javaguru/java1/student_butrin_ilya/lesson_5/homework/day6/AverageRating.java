package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day6;

import java.util.Arrays;

public class AverageRating {
    public double calculateAverageRating (int ... mark) {
        int numberOfMarks = mark.length;
        int sum = Arrays.stream(mark).sum();
        return (double)sum / numberOfMarks;


    }
}
