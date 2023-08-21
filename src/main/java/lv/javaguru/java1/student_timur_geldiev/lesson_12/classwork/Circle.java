package lv.javaguru.java1.student_timur_geldiev.lesson_12.classwork;

class Circle extends AbstractShape {

    private int radius;
    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;

    }
    @Override
    public double calculateArea(){
        return Math.PI * (radius * radius);

    }
}
