package lv.javaguru.java1.student_butrin_ilya.lesson_15.middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetRandomNumber  implements Runnable {
    Random rand = new Random();
    RandomNumberList random = new RandomNumberList();
    int randomNum;

    @Override
    public void run() {
        random.add(rand.nextInt(10));
    }

    public List<Integer> getRandomNumbers() {
        return random.getRandomNumbers();
    }
}
