package lv.javaguru.java1.student_ainars_belinskis.lesson_6.lessoncode;

class OddNumberTest {
    public static void main(String[] args) {

        OddNumberTest test = new OddNumberTest();
        test.testEvenNumber();
        test.testOddNumber();
    }

    public void testEvenNumber() {
        // 1. Подготовка тестовых данных
        // - input      4
        // - output/result = true
        int number = 4;

        // 2. Вызываем продакшн код
        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(number);

        // 3. Сравниваем ожидаемый с полученным результатом
        if (result == true) {
            System.out.println("TEST FAIL!");
        } else {
            System.out.println("TEST OK!");
        }
    }

    public void testOddNumber() {
        // 1. Подготовка тестовых данных
        // - input      5
        // - output/result = false
        int number = 5;

        // 2. Вызываем продакшн код
        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(number);

        // 3. Сравниваем ожидаемый с полученным результатом
        if (result == false) {
            System.out.println("TEST FAIL!");
        } else {
            System.out.println("TEST OK!");
        }
    }

}
