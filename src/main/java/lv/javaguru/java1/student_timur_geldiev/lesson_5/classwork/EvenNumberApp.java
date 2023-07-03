package lv.javaguru.java1.student_timur_geldiev.lesson_5.classwork;

public class EvenNumberApp {
    public static void main(String[] args) {
        EvenNumber calc1 = new EvenNumber();
        System.out.println("The number is even = " + calc1.isEven(1));
        System.out.println("The number is even = " + calc1.isEven(2));
        System.out.println("The number is even = " + calc1.isEven(3));
        System.out.println("The number is even = " + calc1.isEven(4));
        System.out.println("The number is even = " + calc1.isEven(5));

        System.out.println("The number is odd = " + calc1.isOdd(1));
        System.out.println("The number is odd = " + calc1.isOdd(2));
        System.out.println("The number is odd = " + calc1.isOdd(3));
        System.out.println("The number is odd = " + calc1.isOdd(4));
        System.out.println("The number is odd = " + calc1.isOdd(5));
    }
}
