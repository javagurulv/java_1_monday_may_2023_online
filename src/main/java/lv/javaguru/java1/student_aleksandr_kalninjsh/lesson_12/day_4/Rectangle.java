package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_4;

public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(String title, double a, double b) {
        super(title);
        this.a = a;
        this.b = b;
    }

    public double calculateArea() {
        return a * b;
    }
    public double calculatePerimeter() {
        return 2 * (a + b);
    }
}
