package lv.javaguru.java1.student_ainars_belinskis.lesson_5.homework.day_4;

class CirclePerAreaApp {
    public static void main(String[] args) {
        CirclePerimetrAreaCalculator circlePerimetrAreaCalculator = new CirclePerimetrAreaCalculator();
        System.out.println("Circle Perimetr = " + circlePerimetrAreaCalculator.CirclePerimetr(33));
        System.out.println("Circle Perimetr = " + circlePerimetrAreaCalculator.CirclePerimetr(57));
        System.out.println("Circle Area = " + circlePerimetrAreaCalculator.CircleArea(33));
        System.out.println("Circle Area = " + circlePerimetrAreaCalculator.CircleArea(80));
    }
}
