package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.lessoncode;

class TriangleSquareApp {

    public static void main(String[] args) {
    TriangleSquare trianglePerimeter = new TriangleSquare();
    System.out.println("Semi perimeter = " + trianglePerimeter.calculateSemiPerimeter(2, 3, 4));

    TriangleSquare triangleSquare = new TriangleSquare();
    System.out.println("Square = " + triangleSquare.calculateSquare(2, 3, 4));

    }

}
