package lv.javaguru.java1.student_timur_geldiev.lesson_5.homework.day_6;

import java.util.Scanner;

class Scorecard {

    String studentName;
    String studentLastName;
    int mathMark;
    int literatureMark;
    int geographyMark;
    int physicsMark;

    public Scorecard(String studentName, String studentLastName, int mathMark, int literatureMark, int geographyMark, int physicsMark) {
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.mathMark = mathMark;
        this.literatureMark = literatureMark;
        this.geographyMark = geographyMark;
        this.physicsMark = physicsMark;
    }

    public double findAverage(int mathMark, int literatureMark, int geographyMark, int physicsMark) {
        return (mathMark + literatureMark + geographyMark + physicsMark) / (double) 4;
    }

}
