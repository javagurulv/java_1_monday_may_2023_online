package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.homework.day_4;

class CirclePerimeterSquareApp {
    public static void main(String[] args) {
        CirclePerimeterSquare circlePerimeter = new CirclePerimeterSquare();
        System.out.println("The perimeter of the circle: " + circlePerimeter.calculateCirclePerimeter(5));

        CirclePerimeterSquare circleSquare = new CirclePerimeterSquare();
        System.out.println("The square of the circle: " + circleSquare.calculateCircleSquare(5));
    }
}
