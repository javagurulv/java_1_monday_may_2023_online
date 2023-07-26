package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_6.day_1;

class TriangleSquareTest {

    public static void main(String[] args) {

        TriangleSquareTest triangleSquareTest = new TriangleSquareTest();
        triangleSquareTest.squareTest();
        triangleSquareTest.semiPerimeterTest();


    }

        public void squareTest() {
            TriangleSquare square = new TriangleSquare();
            int a = 3;
            int b = 6;
            int c = 9;
            double expectedResult = 12.7;
            double realResult = square.calculateSquare(a, b, c);
            if (realResult == expectedResult) {
                System.out.println("Square test = OK ");
            }
            else {
                System.out.println("Square test = FAIL ");
            }
        }
        public void semiPerimeterTest() {
        TriangleSquare square = new TriangleSquare();
        int a = 3;
        int b = 2;
        int c = 5;
        double expectedResult = 5;
        double realResult = square.calculateSemiPerimeter(a, b, c);
        if (realResult == expectedResult) {
            System.out.println("Perimeter test = OK ");
        }
        else {
            System.out.println("Perimeter test = FAIL ");
        }

        }


}
