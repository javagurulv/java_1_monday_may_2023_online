package lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_4;

class Rectangle extends Shape{

    int a;
    int b;

    public Rectangle(String title, int a, int b) {
        super(title);
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
