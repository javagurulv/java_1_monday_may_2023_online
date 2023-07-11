package lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.day_4;

class FactorialRecursion {

    public int factorial(int n) {
        if (n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

}
