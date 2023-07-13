package lv.javaguru.java1.student_timur_geldiev.lesson_6.homework.day_1;

class AverageFinderTest {

    public double findAverage(int num1, int num2) {
        int sum = num1 + num2;
        return sum / (double)2;
    }
    public static void main(String[] args) {
        AverageFinderTest test = new AverageFinderTest();
        test.findCorrectAverage();

    }
    public void findCorrectAverage(){
        int num1 = 5;
        int num2 = 6;
        AverageFinderTest check1 = new AverageFinderTest();
        double actual = check1.findAverage(num1, num2);
        checkResult(actual, 5.5, "FindAverage" );
    }

    public void checkResult(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " Test PASS");
        } else {
            System.out.println(testName + " Test FAIL." + " Reason: " + "actualResult: " + actualResult + " not equal expected result: " + expectedResult );
        }
    }
}
