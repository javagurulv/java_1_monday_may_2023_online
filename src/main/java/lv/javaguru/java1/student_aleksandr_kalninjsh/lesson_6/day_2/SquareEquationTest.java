package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_6.day_2;

public class SquareEquationTest {

    public static void main(String[] args) {

        SquareEquationTest square = new SquareEquationTest();
        square.discriminantTest();
        square.isSquareRootTest();
        square.firstRoot();
        square.secondRoot();


    }
    public void discriminantTest() {
        SquareEquation square = new SquareEquation();
        int a = 2;
        int b = 7;
        int c = 3;
        double expectedResult = 25;
        double realResult = square.discriminant(a, b, c);
        if (realResult == expectedResult) {
            System.out.println("Discriminant test = OK");
        }
        else {
            System.out.println("Discriminant test = FAIL");
        }
    }
    public void isSquareRootTest() {
        SquareEquation square = new SquareEquation();
        int a = 2;
        int b = 7;
        int c = 3;
        boolean expectedResult = true;
        boolean realResult = square.isSquareRoot(a, b, c);
        if (realResult == expectedResult) {
            System.out.println("Square root test = OK");
        }
        else {
            System.out.println("Square root test = FAIL");
        }
    }
    public void firstRoot() {
        SquareEquation square = new SquareEquation();
        int a = 2;
        int b = 7;
        int c = 3;
        double expectedResult = -3;
        double realResult = square.firstRoot(a, b, c);
        if (realResult == expectedResult) {
            System.out.println("First root test = OK");
        }
        else {
            System.out.println("First root test = FAIL");
        }
    }
    public void secondRoot() {
        SquareEquation square = new SquareEquation();
        int a = 2;
        int b = 7;
        int c = 3;
        double expectedResult = -0.5;
        double realResult = square.secondRoot(a, b, c);
        if (realResult == expectedResult) {
            System.out.println("Second root test = OK");
        }
        else {
            System.out.println("Second root test = FAIL");
        }
    }
}
