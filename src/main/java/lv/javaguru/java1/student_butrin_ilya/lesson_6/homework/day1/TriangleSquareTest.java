package lv.javaguru.java1.student_butrin_ilya.lesson_6.homework.day1;

public class TriangleSquareTest {
    TriangleSquare triangleSquare = new TriangleSquare();
    public static void main(String[] args) {
        TriangleSquareTest test = new TriangleSquareTest();
        test.semiperimetrTest();
        test.squareTest();
    }
        public void semiperimetrTest() {
            double realRezultOne = 4.5;
            double expectedRezultOne = triangleSquare.calculateSemiPerimeter(3, 2, 4);
            checkRezult(realRezultOne, expectedRezultOne, "1");
        }
        public void squareTest (){
        double expectedRezult = triangleSquare.calculateSquare(3,4,5);
        double realRezult = 6;
        checkRezult(realRezult, expectedRezult, "2");
        }
            public void checkRezult (double realRezut, double expectedRezult, String testNumber) {
        if (realRezut == expectedRezult) { System.out.println( "test" + testNumber + " is ok");}
        else {System.out.println("test" + testNumber + " is not ok");}
            }
    }

