package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.lessoncode;

import java.util.Random;

class GenerateRandomNumber {

        public int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        GenerateRandomNumber generateRandomNumber1 = new GenerateRandomNumber();
        generateRandomNumber1.generateRandomNumber(4, 7);
        System.out.println(generateRandomNumber1.generateRandomNumber(4, 7));
    }
}
