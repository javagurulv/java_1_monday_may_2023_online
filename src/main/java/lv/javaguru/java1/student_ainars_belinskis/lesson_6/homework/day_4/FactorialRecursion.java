package lv.javaguru.java1.student_ainars_belinskis.lesson_6.homework.day_4;

class FactorialRecursion {

    public int factorial(int n) {
        if (n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

}
