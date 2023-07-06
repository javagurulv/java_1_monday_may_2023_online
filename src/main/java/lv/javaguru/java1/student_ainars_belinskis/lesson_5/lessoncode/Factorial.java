package lv.javaguru.java1.student_ainars_belinskis.lesson_5.lessoncode;

class Factorial {

    public static int factorialCikl(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
    }
        return result;

    }
}