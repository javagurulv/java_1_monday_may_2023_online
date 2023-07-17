package lv.javaguru.java1.student_timur_geldiev.lesson_7.classwork;

import java.util.Arrays;

public class ArrayOfNullsTest {
    public static void main(String[] args) {
        ArrayOfNullsTest test = new ArrayOfNullsTest();
        test.methodCheck();
    }
    public void methodCheck(){
        ArrayOfNulls test1 = new ArrayOfNulls();
        int[] actual = test1.arrayOfNulls();
        int[] expected = {0,0,0,0,0,0,0,0,0,0};
        checkResult(actual, expected, "Array of nulls check");
    }

    public void checkResult(int[] actualResult, int[] expectedResult, String testName) {
        if (Arrays.equals(actualResult, expectedResult)) {
            System.out.println(testName + " Test PASS");
        } else {
            System.out.println(testName + " Test FAIL." + " Reason: " + "actualResult: " + actualResult + " not equal expected result: " + expectedResult );
        }
    }
}
