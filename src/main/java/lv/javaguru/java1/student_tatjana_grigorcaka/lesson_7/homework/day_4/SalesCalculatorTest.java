package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_4;

import java.util.ArrayList;
import java.util.List;

public class SalesCalculatorTest {

    public static void main(String[] args) {

        List<Check> allChecks = new ArrayList<>();

        SalesCalculator salesCalculator = new SalesCalculator();
        salesCalculator.addCheck(allChecks, 0012345, 30);
        salesCalculator.addCheck(allChecks, 0012346, 40);
        System.out.println("RESULT: " + salesCalculator.sumPurchaseSum(allChecks));
        System.out.println("RESULT: " + salesCalculator.averagePurchaseSum(allChecks));

        SalesCalculatorTest test = new SalesCalculatorTest();
        test.testSumPurchaseSum(allChecks);
        test.testAveragePurchaseSum(allChecks);
    }

    public void testSumPurchaseSum(List<Check> allChecks) {
        int sumPurchase = 70;
        SalesCalculator salesCalculator = new SalesCalculator();
        int result = salesCalculator.sumPurchaseSum(allChecks);
        System.out.println("TEST RESULT: " + result);
        if (result == sumPurchase) {
            System.out.println("TEST RESULT: OK!");
        } else {
            System.out.println("TEST TEST: FAIL!");
        }
    }

    public void testAveragePurchaseSum(List<Check> allChecks) {
        int averagePurchase = 35;
        SalesCalculator salesCalculator = new SalesCalculator();
        int result = salesCalculator.averagePurchaseSum(allChecks);
        System.out.println("TEST RESULT: " + result);
        if (result == averagePurchase) {
            System.out.println("TEST RESULT: OK!");
        } else {
            System.out.println("TEST RESULT: FAIL!");
        }
    }
}

