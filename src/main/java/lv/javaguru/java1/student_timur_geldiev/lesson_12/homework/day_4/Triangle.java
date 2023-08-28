package lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_4;

public class Triangle extends Shape{

    int a;
    int b;
    int c;

    public Triangle(String title, int a, int b, int c) {
        super(title);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double calculateArea(){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    @Override
    public double calculatePerimeter(){
        return a + b + c;

    }
}
