package lv.javaguru.java1.student_butrin_ilya.lesson_5.Classwork;

public class FactorialApp {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.findFactorial(50));
        System.out.println(factorial.findFactorialRecursion(50));
    }
}
