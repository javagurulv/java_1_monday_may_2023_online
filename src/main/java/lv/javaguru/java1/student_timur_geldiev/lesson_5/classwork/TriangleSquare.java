package lv.javaguru.java1.student_timur_geldiev.lesson_5.classwork;

public class TriangleSquare {
    public double calculateSquare(int a, int b, int c) {
        double p = findSemiPerimeter(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double findSemiPerimeter(int a, int b, int c) {
        return (a + b + c) / (double) 2;

    }
}
