package lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_4;

public abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}
