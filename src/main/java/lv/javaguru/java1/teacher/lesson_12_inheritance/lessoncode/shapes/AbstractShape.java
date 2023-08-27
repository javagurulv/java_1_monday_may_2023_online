package lv.javaguru.java1.teacher.lesson_12_inheritance.lessoncode.shapes;

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
