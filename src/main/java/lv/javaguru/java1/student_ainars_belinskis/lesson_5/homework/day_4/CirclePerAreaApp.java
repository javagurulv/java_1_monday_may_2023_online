package lv.javaguru.java1.student_ainars_belinskis.lesson_5.homework.day_4;

class CirclePerAreaApp {
    public static void main(String[] args) {
        CirclePerimeterAreaCalculator circlePerimeterAreaCalculator = new CirclePerimeterAreaCalculator();
        System.out.println("Circle Perimetr = " + circlePerimeterAreaCalculator.CirclePerimeter(33));
        System.out.println("Circle Perimetr = " + circlePerimeterAreaCalculator.CirclePerimeter(57));
        System.out.println("Circle Area = " + circlePerimeterAreaCalculator.CircleArea(33));
        System.out.println("Circle Area = " + circlePerimeterAreaCalculator.CircleArea(80));
    }
}
