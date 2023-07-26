package lv.javaguru.java1.student_butrin_ilya.lesson_7.classwork;

public class SummaFromToNum {
    public int summa(int min, int max) {
        int sum = 0;
        for (int i = min; i <= max; i++ ) {
            sum = sum + i;
        }
        return sum;
    }
}
