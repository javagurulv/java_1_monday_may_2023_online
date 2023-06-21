package lv.javaguru.java1.student_timur_geldiev.lesson_3.homework.day7;

class Circle {
    double radius;

    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public Circle(double circleRadius) {
        radius = circleRadius;
    }
}
