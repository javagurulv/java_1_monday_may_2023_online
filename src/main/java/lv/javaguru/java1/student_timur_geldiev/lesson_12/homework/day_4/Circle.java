package lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_4;

class Circle extends Shape{

    private double radius;

    public Circle(String title, double radius) {
        super(title);
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
