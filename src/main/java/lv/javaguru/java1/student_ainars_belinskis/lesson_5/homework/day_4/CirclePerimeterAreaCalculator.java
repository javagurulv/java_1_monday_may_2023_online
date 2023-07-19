package lv.javaguru.java1.student_ainars_belinskis.lesson_5.homework.day_4;

class CirclePerimeterAreaCalculator {
    public double CircleArea(double radius){
        double area = Math.PI * radius * radius;
        return area;
    }

    public double CirclePerimeter(double radius){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

}
