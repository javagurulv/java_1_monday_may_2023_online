package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.lessoncode;

public class FactorialApp {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int num = 7;
        System.out.println("Factorial of number " + num + " is: ");
        System.out.println(factorial.factorialCycleFor(num));
        System.out.println("Factorial of number " + num + " is: ");
        System.out.println(factorial.factorialCycleWhile(num));
        System.out.println("Factorial of number " + num + " is: ");
        System.out.println(factorial.factorialRecursion(num));
    }
}
