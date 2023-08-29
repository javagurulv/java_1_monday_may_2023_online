package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_12.homework.day_4;

public class Triangle extends Shape {
    private double a;


    public Triangle(String title, double a) {
        super(title);
        this.a = a;

    }
    @Override
    public double calculateArea() {
        double s = calculateSemiPerimeter(a);
        return Math.sqrt(s * (s - a) * (s - a) * (s - a));
    }

    private double calculateSemiPerimeter(double a) {
        return (a + a + a) / (double) 2;
    }

    @Override
    public double calculatePerimeter() { return a + a + a; }
}



