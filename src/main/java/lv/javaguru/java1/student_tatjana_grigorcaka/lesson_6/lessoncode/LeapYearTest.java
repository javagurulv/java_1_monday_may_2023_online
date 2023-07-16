package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.lessoncode;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();
        test.testIsLeapYearTrue();
        test.testIsLeapYearFalse();
    }

    public void testIsLeapYearTrue() {
    LeapYear leapYear = new LeapYear();
    boolean result = leapYear.isLeapYear(1704);
    checkResult(result, true, "testIsLeapYearTrue");
    }

    public void testIsLeapYearFalse() {
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(1700);
        checkResult(result, false, "testIsLeapYearFalse");
    }

    private void checkResult(boolean realResult,
                             boolean expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!" + " Expected result = " + expectedResult + " but Real result = " + realResult);
        }
    }
}

