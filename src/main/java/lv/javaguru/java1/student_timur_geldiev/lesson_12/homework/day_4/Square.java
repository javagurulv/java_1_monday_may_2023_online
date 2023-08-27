package lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_4;

class Square extends Shape{

    int a;

    public Square(String title, int a) {
        super(title);
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
