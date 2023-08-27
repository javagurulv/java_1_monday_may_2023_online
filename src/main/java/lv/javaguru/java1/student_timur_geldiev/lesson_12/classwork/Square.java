package lv.javaguru.java1.student_timur_geldiev.lesson_12.classwork;

public class Square extends AbstractShape {
    int a;

    public Square(String name, int a) {
        super(name);
        this.a = a;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }
}
