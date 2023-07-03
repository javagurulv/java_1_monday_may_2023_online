package lv.javaguru.java1.student_timur_geldiev.lesson_5.classwork;

class EvenNumberApp {
    public static void main(String[] args) {
        EvenNumberDetector calc1 = new EvenNumberDetector();
        OddNumberDetector calc2 = new OddNumberDetector();
        TwoNumAverage calc3 = new TwoNumAverage();
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

        System.out.println("Average number is " + calc3.findAverage(4, 5));
        System.out.println("Average number is " + calc3.findAverage(10, 6));
        System.out.println("Average number is " + calc3.findAverage(1111, 2345));
        System.out.println("Average number is " + calc3.findAverage(-4, 6));

        System.out.println("Average number is " + calc3.findAverageDouble(4, 5));
        System.out.println("Average number is " + calc3.findAverageDouble(10, 6));
        System.out.println("Average number is " + calc3.findAverageDouble(1111, 2345));
        System.out.println("Average number is " + calc3.findAverageDouble(-4, 6));
    }
}
