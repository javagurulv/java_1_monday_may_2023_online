package lv.javaguru.java1.student_alexey_kosmachev.lesson_6.homework.day_4;

class FactorialRecursion {
// в случае, когда аргумент функции меньше либо равен 1, рекурсивная функция прекращает свою работу и возвращает в качестве результата 1
// вместо равенства единице ставим условие if <= 1
    public int factorial(int n) {
        if (n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

}
