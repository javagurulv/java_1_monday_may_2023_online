package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_2;

import java.util.Random;

class RandomIntArray {

    public int[] randomIntArray() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public void printRandomIntArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

    }
}
        


