package lv.javaguru.java1.student_butrin_ilya.lesson_12.day4;

public class Rectangle extends Shape{
    int sideA;
    int sideB;

    public Rectangle(String title, int sideA, int sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public double calculateArea(){
        return sideA*sideB;
    }
    public double calculatePerimetr(){
        return (sideA*2)+(sideB*2);
    }
}
