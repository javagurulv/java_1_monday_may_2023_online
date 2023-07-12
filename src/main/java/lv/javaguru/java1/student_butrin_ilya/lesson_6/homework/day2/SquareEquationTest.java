package lv.javaguru.java1.student_butrin_ilya.lesson_6.homework.day2;

public class SquareEquationTest {
    SquareEquation squareEquation = new SquareEquation();


    public static void main(String[] args) {
        SquareEquationTest squareEquationTest = new SquareEquationTest();
        squareEquationTest.discriminantTest();
        squareEquationTest.isSquareRootTestTrue();
        squareEquationTest.isSquareRootTestFalse();
        squareEquationTest.firstRootTest();
        squareEquationTest.secondRootTest();

    }
    public void discriminantTest (){
        double realRezult = 36;
        double expectedRezult = squareEquation.discriminant(1, -8, 7);
        checkRezultDouble(realRezult, expectedRezult, "1 (discriminante)");
    }
    public void isSquareRootTestTrue () {
        boolean realRezult = true;
        boolean expectedRezult = squareEquation.isSquareRoot(1,-8, 7);
        checkRezultBoolean(realRezult,expectedRezult,"2 (is root true)");
    }
    public void isSquareRootTestFalse () {
        boolean realRezult = false;
        boolean expectedRezult = squareEquation.isSquareRoot(1,1, 1);
        checkRezultBoolean(realRezult,expectedRezult,"2 (is root faste)");
    }
    public void firstRootTest() {
        double realRezult = 1;
        double expextedRezult = squareEquation.firstRoot(1,-8,7);
        checkRezultDouble(realRezult,expextedRezult,"3 (first root)");
    }
    public void secondRootTest() {
        double realRezult = 7;
        double expextedRezult = squareEquation.secondRoot(1,-8,7);
        checkRezultDouble(realRezult,expextedRezult,"4 (second root)");
    }
    public void checkRezultDouble (double realRezult, double expectedRezult, String name) {
        if (realRezult == expectedRezult) System.out.println("test" + name + " OK");
        else System.out.println("test" + name + " FAIL");
    }

    public void checkRezultBoolean (boolean realRezult, boolean expectedRezult, String name) {
        if (realRezult == expectedRezult) System.out.println("test" + name + " OK");
        else System.out.println("test" + name + " FAIL");
    }
}
