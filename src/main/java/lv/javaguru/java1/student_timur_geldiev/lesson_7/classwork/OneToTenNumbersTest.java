package lv.javaguru.java1.student_timur_geldiev.lesson_7.classwork;

import java.util.Scanner;

class OneToTenNumbersTest {
    public static void main(String[] args) {
        OneToTenNumbersTest test = new OneToTenNumbersTest();
        test.checkString();


        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        OneToTenNumbers nums2 = new OneToTenNumbers();
        nums2.numsToConsoleV2(num1, num2);

    }
    public void checkString(){
        OneToTenNumbers test1 = new OneToTenNumbers();
        String  actual = test1.numsToConsole();
        checkResult(actual, "1 2 3 4 5 6 7 8 9 10", "String check");
    }
    public void checkResult(String actualResult, String  expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " Test PASS");
        } else {
            System.out.println(testName + " Test FAIL." + " Reason: " + "actualResult: " + actualResult + " not equal expected result: " + expectedResult );
        }
    }
}
