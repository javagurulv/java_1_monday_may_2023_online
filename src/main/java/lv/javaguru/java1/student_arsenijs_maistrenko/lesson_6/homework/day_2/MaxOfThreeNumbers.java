package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_6.homework.day_2;

class MaxOfThreeNumbers {

    public int findMax(int num1, int num2, int num3) {
        int max = Math.max(num1, num2);
        return Math.max(max, num3);
    }

}
