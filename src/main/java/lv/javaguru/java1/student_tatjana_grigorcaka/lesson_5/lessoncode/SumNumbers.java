package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.lessoncode;

class SumNumbers {

    public int sumNumbers(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Число должно быть положительным");
        }
        if (number == 1) {
            return 1;
        }
        return number + sumNumbers(number - 1);
    }

    public static void main(String[] args) {
        SumNumbers sumNumbers1 = new SumNumbers();
        sumNumbers1.sumNumbers(3);
        System.out.println("Sum Numbers " + sumNumbers1.sumNumbers(3));

    }
}
