package lv.javaguru.java1.student_butrin_ilya.lesson_12.day4;

public class RectangleTest {
    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.test1Perimetr();
        test.test1Area();
    }

    public void test1Perimetr () {
        Rectangle rectangle = new Rectangle("1", 10, 2);
        double real = 24;
        double expect = rectangle.calculatePerimetr();
        if(real == expect) System.out.println("ok");
        else System.out.println("ou fuck");
    }
    public void test1Area () {
        Rectangle rectangle = new Rectangle("1", 10, 2);
        double real = 20;
        double expect = rectangle.calculateArea();
        if(real == expect) System.out.println("ok");
        else System.out.println("ou fuck");
    }

}
