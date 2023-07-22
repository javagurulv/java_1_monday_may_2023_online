package lv.javaguru.java1.student_butrin_ilya.lesson_7.homework.day2;

public class RandomIntArray {
    public double[] randomFrom1To100() {
        double[] random = new double[10];
        for (int i = 0; random.length > i; i++) {
            random[i] = (Math.random() * 100) + 1;
        }
        return random;
    }

    public void showRandomMassive(double[] massive) {
        for (int i = 0; massive.length > i; i++) {
            System.out.print((int)massive[i] + " ");
        }

    }
}
