package lv.javaguru.java1.teacher.lesson_6_unit_testing.lessoncode;

class OddNumberTest {

    public static void main(String[] args) {
        OddNumberTest test = new OddNumberTest();
        test.testIsEvenNumber();
        test.testIsOddNumber();
    }

    public void testIsOddNumber() {
        int number = 5;
        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(number);
        if (result == true) {
            System.out.println("TEST OK!");
        } else {
            System.out.println("TEST FAIL!");
        }
    }

    public void testIsEvenNumber() {
        int number = 4;
        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(number);
        if (result == false) {
            System.out.println("TEST OK!");
        } else {
            System.out.println("TEST FAIL!");
        }
    }

}
