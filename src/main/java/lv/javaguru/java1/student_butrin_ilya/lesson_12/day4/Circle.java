package lv.javaguru.java1.student_butrin_ilya.lesson_12.day4;

public class Circle extends Shape{
    int radius;

    public Circle(String title, int radius) {
        super(title);
        this.radius = radius;
    }
    public double calculateArea (){
        return Math.PI * radius*radius;
    }

    public double calculatePerimetr() {
        return 2* Math.PI*radius;
    }
}
