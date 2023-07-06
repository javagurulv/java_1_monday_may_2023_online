package lv.javaguru.java1.student_timur_geldiev.lesson_5.homework.day_6;

import java.util.Arrays;

class ScoreCardV2 {

    String studentName;
    String studentLastName;
    int[] marks;


    public ScoreCardV2(String studentName, String studentLastName, int[] marks) {
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.marks = marks;
    }

    public double findAverageV2(int[] marks) {
        return (Arrays.stream(marks).sum()) / (double) marks.length;
    }
}
