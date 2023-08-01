package lv.javaguru.java1.student_timur_geldiev.lesson_7.classwork;

class SumFromOneToHundredTest {

    public static void main(String[] args) {
        SumFromOneToHundredTest test = new SumFromOneToHundredTest();
        test.sumFrom1To100Check();
    }
    public void sumFrom1To100Check(){
        SumFromOneToHundred test1 = new SumFromOneToHundred();
        int actual = test1.sumFromTo(5, 20);
        checkResult(actual, 200, "Sum check");
    }

    public void checkResult(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " Test PASS");
        } else {
            System.out.println(testName + " Test FAIL." + " Reason: " + "actualResult: " + actualResult + " not equal expected result: " + expectedResult );
        }
    }
}
