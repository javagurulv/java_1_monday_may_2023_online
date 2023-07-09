package lv.javaguru.java1.student_ainars_belinskis.lesson_5.homework.day_4;

class CirclePerimetrAreaCalculator {
    public double CircleArea(double radius){
        double area = Math.PI * radius * radius;
        return area;
    }

    public double CirclePerimetr(double radius){
        double perimetr = 2 * Math.PI * radius;
        return perimetr;
    }

}
