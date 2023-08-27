package lv.javaguru.java1.student_butrin_ilya.lesson_12.day4;

public class SquareTest {
    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.test1Perimetr();
        test.test1Area();
    }

    public void test1Perimetr () {
        Square square = new Square("1", 10);
        double real = 40;
        double expect = square.calculatePerimetr();
        if(real == expect) System.out.println("ok");
        else System.out.println("ou fuck");
    }
    public void test1Area () {
        Square square = new Square("1", 10);
        double real = 100;
        double expect = square.calculateArea();
        if(real == expect) System.out.println("ok");
        else System.out.println("ou fuck");
    }
}
