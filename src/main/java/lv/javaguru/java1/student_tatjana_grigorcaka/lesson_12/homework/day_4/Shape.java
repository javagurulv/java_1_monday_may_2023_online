package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_12.homework.day_4;

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
