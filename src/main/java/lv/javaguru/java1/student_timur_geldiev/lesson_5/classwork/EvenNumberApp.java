package lv.javaguru.java1.student_timur_geldiev.lesson_5.classwork;

public class EvenNumberApp {
    public static void main(String[] args) {
        EvenNumberDetector calc1 = new EvenNumberDetector();
        OddNumberDetector calc2 = new OddNumberDetector();
        System.out.println("The number is even = " + calc1.isEven(1));
        System.out.println("The number is even = " + calc1.isEven(2));
        System.out.println("The number is even = " + calc1.isEven(3));
        System.out.println("The number is even = " + calc1.isEven(4));
        System.out.println("The number is even = " + calc1.isEven(5));

        System.out.println("The number is odd = " + calc2.isOdd(1));
        System.out.println("The number is odd = " + calc2.isOdd(2));
        System.out.println("The number is odd = " + calc2.isOdd(3));
        System.out.println("The number is odd = " + calc2.isOdd(4));
        System.out.println("The number is odd = " + calc2.isOdd(5));
    }
}
