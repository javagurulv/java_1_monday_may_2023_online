package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_7.homework.day_4;

public class ReceiptCalcTest {
    public static void main(String[] args) {
        ReceiptCalcTest test = new ReceiptCalcTest();
        test.test1();
        test.test2();
    }
    public void test1() {
        CashReceipt[] receipts = {
                new CashReceipt(1, 12.15),
                new CashReceipt(1, 54.21),
                new CashReceipt(1, 47.12),
                new CashReceipt(1, 12.99),
        };
        ReceiptCalc calculator = new ReceiptCalc();
        double totalSum = calculator.TotalSum(receipts);
        checkResult(totalSum, 126.47, "Total Sum");
    }
    public void test2() {
        CashReceipt[] receipts = {
                new CashReceipt(1, 12.15),
                new CashReceipt(1, 54.21),
                new CashReceipt(1, 47.12),
                new CashReceipt(1, 12.99),
        };
        ReceiptCalc calculator = new ReceiptCalc();
        double AvgSum = calculator.AvgSum(receipts);
        checkResult(AvgSum, 31.6175, "Average Sum");
    }
    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": PASS");
        } else {
            System.out.println(testScenarioName + ": FAIL");
        }
    }
}