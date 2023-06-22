package lv.javaguru.java1.student_ainars_belinskis.lesson_3.homework.day_7;

class Circle {
    double radius;

    public Circle(double circleRadius) {
        radius = circleRadius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
