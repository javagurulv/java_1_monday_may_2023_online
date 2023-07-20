package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.lessoncode;

class CountDigits {
    public int countDigits(int number) {
        if (number < 0) {
            number = -number;  // Учитываем отрицательные числа
        }
        if (number < 10) {
            return 1;
        }
        return 1 + countDigits(number / 10);
    }
    public static void main(String[] args) {
        CountDigits countDigits1= new CountDigits();
        countDigits1.countDigits(789);
        System.out.println(countDigits1.countDigits(789));

    }
}
