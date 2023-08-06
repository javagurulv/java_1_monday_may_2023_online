package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_7.day_2;
import java.util.Arrays;
import java.util.Random;

class RandomIntArray {

    public int[] randomNumbers() {
        int numbers[] = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = (int) (Math.random() * 100);
        }
        return numbers;

    }
    public void numbersPrint(int []numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}