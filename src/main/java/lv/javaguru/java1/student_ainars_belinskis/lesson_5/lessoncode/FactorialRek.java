package lv.javaguru.java1.student_ainars_belinskis.lesson_5.lessoncode;

class FactorialRek {


    public static int factorialRek(int n) {
        if (n == 1){
            return 1;
        }
        return n * factorialRek(n - 1);
    }


}
