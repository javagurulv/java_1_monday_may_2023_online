package lv.javaguru.java1.student_timur_geldiev.lesson_6.homework.day_4;

class FactorialForLoop {

    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}
