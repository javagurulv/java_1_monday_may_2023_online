package lv.javaguru.java1.student_butrin_ilya.lesson_12.day4;

public class TriangleTest {
    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.test1Perimetr();
        test.test1Area();
    }

    public void test1Perimetr() {
        Triangle triangle = new Triangle("1", 10);
        double real = 30;
        double expect = triangle.calculatePerimetr();
        if (real == expect) System.out.println("ok");
        else System.out.println("ou fuck");
    }

    public void test1Area() {
        Triangle triangle = new Triangle("1", 10);
        double real = 43.30127;
        double expect = Math.round(triangle.calculateArea() * 100000) / 100000.0;
        if (real == expect) System.out.println("ok");
        else System.out.println("ou fuck");
    }
}

