package lv.javaguru.java1.student_butrin_ilya.lesson_12.day4;

public class CircleTest {
    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.test1Perimetr();
        test.test1Area();
    }

        public void test1Perimetr () {
            Circle circle1 = new Circle("1", 10);
            double real = 20*Math.PI;
            double expect = circle1.calculatePerimetr();
            if(real == expect) System.out.println("ok");
            else System.out.println("ou fuck");
        }
    public void test1Area () {
        Circle circle1 = new Circle("1", 10);
        double real = 100*Math.PI;
        double expect = circle1.calculateArea();
        if(real == expect) System.out.println("ok");
        else System.out.println("ou fuck");
    }
    }
