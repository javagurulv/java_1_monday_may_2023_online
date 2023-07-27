package lv.javaguru.java1.student_ainars_belinskis.lesson_7.homework.day_2;

import java.util.Arrays;

class RandomIntArray {
    public int[] randomIntNumber() {
        int[] intNumber = new int[10];
        for (int i = 0; i <= intNumber.length - 1; i++) {
            intNumber[i] = (int) (Math.random() * 100);
        }
        return intNumber;
    }

    public void randomIntNumberPrint(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}



