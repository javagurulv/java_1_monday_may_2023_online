package lv.javaguru.java1.student_timur_geldiev.lesson_5.classwork;

public class BiggerNumber {
    public int findBigger(int number1, int number2) {
        return (number1 > number2) ? number1 : number2;
    }
    public int findMax(int number1, int number2, int number3){
        int max = findBigger(number1, number2);
        max = findBigger(max, number3);
        return max;
    }
}
