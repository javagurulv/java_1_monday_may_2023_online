package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_4;

public abstract class Shape {

    private String title;


    Shape(String title) {
        this.title = title;

    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public String getTitle() {
        return title;
    }
}
