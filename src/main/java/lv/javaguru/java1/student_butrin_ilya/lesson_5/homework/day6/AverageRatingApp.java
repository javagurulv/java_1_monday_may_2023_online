package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day6;

import java.util.Arrays;

public class AverageRatingApp {
    public static void main(String[] args) {
        ReportCard ivan  = new ReportCard(3,5,2,2,4);
        ReportCard ilya  = new ReportCard(3,3,2,2,4,5,5);
        System.out.println("ilya rating: " + ilya.calculateAverageRating());
        System.out.println("ivan rating: " + ivan.calculateAverageRating());

        int [] ilyaNew = {4,4,4,5,5,5,5};
        ilya.setMarks(ilyaNew);
        System.out.println("NEW ilya rating: " + ilya.calculateAverageRating());
        System.out.println("ilya marks: " + (Arrays.toString(ilya.getMarks())));
        System.out.println("ivan marks: " + (Arrays.toString(ivan.getMarks())));
    }
}
