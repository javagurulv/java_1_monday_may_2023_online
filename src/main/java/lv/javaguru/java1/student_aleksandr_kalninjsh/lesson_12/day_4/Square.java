package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_4;

public class Square extends Shape {

    private double a;

    public Square(String title, double a) {
        super(title);
        this.a = a;
    }

    public double calculateArea() {
        return a * a;
    }
    public double calculatePerimeter() {
        return 4 * a;
    }
}
