package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.lessoncode;

public class Factorial {

    public static int factorialCycleFor(int num) {
        int factorial = 1;
        int i = 1;
        for (i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int factorialCycleWhile(int num) {
        int factorial = 1;
        int i = 1;

        while (i <= num) {
            factorial = factorial * i;
            i++;
        }
        return factorial;
    }

    public static int factorialRecursion(int num) {
        if (num >= 1)
            return num * factorialRecursion(num - 1);
        else
            return 1;
        }
}


