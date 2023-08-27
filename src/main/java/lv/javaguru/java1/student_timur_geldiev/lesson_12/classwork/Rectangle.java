package lv.javaguru.java1.student_timur_geldiev.lesson_12.classwork;

public class Rectangle extends AbstractShape {

    int a;
    int b;
    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePerimeter() {
        return (a + b) * 2;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}
