package lv.javaguru.java1.teacher.lesson_12_inheritance.lessoncode.shapes;

class Circle extends AbstractShape {

    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * radius;
    }

}
