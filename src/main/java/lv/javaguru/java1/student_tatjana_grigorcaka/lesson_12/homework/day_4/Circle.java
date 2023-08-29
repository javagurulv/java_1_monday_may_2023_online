package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_12.homework.day_4;

public class Circle extends Shape {

    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;


    }

    @Override
    public double calculateArea() { return Math.PI * radius * radius; }

    @Override
    public double calculatePerimeter() { return 2 * Math.PI * radius; }

}
