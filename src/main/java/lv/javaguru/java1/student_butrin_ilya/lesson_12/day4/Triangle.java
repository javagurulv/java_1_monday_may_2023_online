package lv.javaguru.java1.student_butrin_ilya.lesson_12.day4;

public class Triangle extends Shape{
    int side;

    public Triangle(String title, int side) {
        super(title);
        this.side = side;
    }
    public double calculateArea() {
        return side*side*Math.sqrt(3)/4;
    }
    public double calculatePerimetr() {
        return side * 3;
    }
}
