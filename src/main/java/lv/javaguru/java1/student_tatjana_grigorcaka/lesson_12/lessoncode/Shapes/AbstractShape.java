package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_12.lessoncode.Shapes;

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

