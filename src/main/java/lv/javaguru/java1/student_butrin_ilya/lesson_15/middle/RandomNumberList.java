package lv.javaguru.java1.student_butrin_ilya.lesson_15.middle;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberList {
        private List<Integer> randomNumbers = new ArrayList<>();

        public void add(int randomNumber) {
            this.randomNumbers.add(randomNumber);
        }

        public int size() {
            return this.randomNumbers.size();
        }

    public List<Integer> getRandomNumbers() {
        return randomNumbers;
    }
}
