package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.homework.day_6;

import static java.lang.System.*;

public class StudentReportCardApp {
    public static void main(String[] args) {
        StudentReportCard student1 = new StudentReportCard("Emily", "Davies",4, 4,5, 4);
        StudentReportCard student2 = new StudentReportCard("William","Taylor",5,4,5,4);

        System.out.println("Student 1 : " + student1.name + student1.lastName);
        System.out.println("Average mark is: " + student1.calculateAverageMark(student1.algebraMark, student1.biologyMark, student1.englishMark, student1.geographyMark));

        System.out.println("Student 2 : " + student2.name + student2.lastName);
        System.out.println("Average mark is: " + student2.calculateAverageMarkFor(student2.algebraMark, student2.biologyMark, student2.englishMark, student2.geographyMark));
    }

}
