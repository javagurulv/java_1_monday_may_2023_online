package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_7.homework.day_2;
import java.util.Random;
public class RandomIntArray {
    public int [] randomArray () {
        Random random = new Random();
        int [] array = new int [10];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public void printRandomNumbers(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
