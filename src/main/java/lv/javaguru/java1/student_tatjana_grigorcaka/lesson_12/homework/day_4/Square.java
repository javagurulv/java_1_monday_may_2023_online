package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_12.homework.day_4;

class Square extends Shape {


    private double a;

    public Square(String title, double a) {
        super(title);
        this.a = a;
    }

    @Override
    double calculateArea() { return a * a; }

    @Override
    double calculatePerimeter() { return 4 * a; }
}
