package lv.javaguru.java1.student_ainars_belinskis.lesson_6.lessoncode;

class OddNumberTest2 {

    public static void main(String[] args) {
        OddNumberTest2 test = new OddNumberTest2();
        test.testIsEvenNumber();
        test.testIsOddNumber();
    }

    public void testIsOddNumber() {
        int number = 5;
        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(number);
        checkResult(result, true, "testIsOddNumber");
    }

    public void testIsEvenNumber() {
        int number = 4;
        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(number);
        checkResult(result, false, "testIsEvenNumber");
    }

    private void checkResult(boolean realResult,
                             boolean expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

}
