package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.lessoncode;

class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();
        test.testLeapYearTrueV1();
        test.testLeapYearTrueV2();
        test.testLeapYearFalseV1();
        test.testLeapYearFalseV2();
        test.testLeapYearFalseV3();
    }

    public void testLeapYearTrueV1() {
    LeapYear leapYear = new LeapYear();
    boolean result = leapYear.isLeapYear(1704);
    checkResult(result, true, "testLeapYearTrueV1");
    }

    public void testLeapYearTrueV2() {
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(0);
        checkResult(result, true, "testLeapYearTrueV2");
    }

    public void testLeapYearFalseV1() {
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(1700);
        checkResult(result, false, "testLeapYearFalseV1");
    }

    public void testLeapYearFalseV2() {
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(5);
        checkResult(result, false, "testLeapYearFalseV2");
    }

    public void testLeapYearFalseV3() {
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(-1);
        checkResult(result, false, "testLeapYearFalseV3");
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

