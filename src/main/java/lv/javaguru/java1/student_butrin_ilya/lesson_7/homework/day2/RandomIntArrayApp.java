package lv.javaguru.java1.student_butrin_ilya.lesson_7.homework.day2;

public class RandomIntArrayApp {
    public static void main(String[] args) {
        RandomIntArray rand = new RandomIntArray();
        double[] random  = rand.randomFrom1To100();
        rand.showRandomMassive(random);
    }
}
