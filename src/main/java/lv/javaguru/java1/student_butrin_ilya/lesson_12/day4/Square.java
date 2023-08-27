package lv.javaguru.java1.student_butrin_ilya.lesson_12.day4;

public class Square extends Shape {
    int side;

    public Square(String title, int side) {
        super(title);
        this.side = side;
    }
    public double calculateArea(){
        return side*side;
    }
    public double calculatePerimetr(){
        return side*4;
    }
}
