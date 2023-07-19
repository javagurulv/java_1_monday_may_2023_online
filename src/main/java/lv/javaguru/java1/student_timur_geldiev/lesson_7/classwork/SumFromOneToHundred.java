package lv.javaguru.java1.student_timur_geldiev.lesson_7.classwork;

class SumFromOneToHundred {

    public int sumFromTo(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum = sum + i;
        }
        return sum;
    }



}
