package lv.javaguru.java1.student_ainars_belinskis.lesson_5.lessoncode;

class TriangleSquareApp {

    public static void main(String[] args) {
        TriangleSquare triangleSquare = new TriangleSquare();

        System.out.println("Semi perimeter = " + triangleSquare.calculateSemiPerimeter(2, 3, 4));
        System.out.println("Triangle square = " + triangleSquare.calculateSquare(2, 3, 4));

    }

}
