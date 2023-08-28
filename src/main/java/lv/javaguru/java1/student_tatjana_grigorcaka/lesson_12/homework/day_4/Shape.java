package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_12.homework.day_4;

abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
