package lv.javaguru.java1.student_timur_geldiev.lesson_12.classwork;

abstract class AbstractShape {

    private String name;

    public AbstractShape(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    abstract double calculatePerimeter();
    abstract double calculateArea();

}
