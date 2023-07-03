package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.workinclass;

public class TriangleSqare {
    public double calculateSquare (int a, int b, int c) {
        double s = calculateSemiPerimeter(a, b, c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double calculateSemiPerimeter(int a, int b, int c) {
        return (a + b + c) / (double) 2;
    }
}
