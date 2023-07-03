package lv.javaguru.java1.student_timur_geldiev.lesson_5.classwork;

public class TriangleSquareApp {
    public static void main(String[] args) {
        TriangleSquare triangle = new TriangleSquare();
        System.out.println("SemiPerimeter is " + triangle.findSemiPerimeter(6,7,8));
        System.out.println("Square is " + triangle.calculateSquare(6,7,8));
    }
}
