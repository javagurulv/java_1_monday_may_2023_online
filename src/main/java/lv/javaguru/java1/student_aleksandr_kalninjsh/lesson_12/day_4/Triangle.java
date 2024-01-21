package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_4;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(String title, double a, double b, double c) {
        super(title);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public double calculatePerimeter() {
        return a + b + c;
    }
}
