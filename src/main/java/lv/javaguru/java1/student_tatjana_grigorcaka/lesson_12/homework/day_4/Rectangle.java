package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_12.homework.day_4;

public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(String title, double a, double b) {
        super(title);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() { return a * b; }

    @Override
    public double calculatePerimeter() { return 2 * (a + b); }
}

