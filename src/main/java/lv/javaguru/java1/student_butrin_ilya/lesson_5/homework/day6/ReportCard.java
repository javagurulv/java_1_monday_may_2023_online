package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day6;
import java.util.Arrays;

class ReportCard {
    int[] marks;
    public ReportCard(int ... marks) {
        this.marks = marks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public double calculateAverageRating() {
        int numberOfMarks = marks.length;
        int sum = Arrays.stream(marks).sum();
        return (double) sum / numberOfMarks;
    }
}
