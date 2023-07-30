package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_4;


class ReceiptCalculatorTest {

    public static void main(String[] args) {

        ReceiptCalculatorTest test = new ReceiptCalculatorTest();
        test.testCalculateTotalSalesSum();
        test.testCalculateAverageSalesSum();
    }

    public void testCalculateTotalSalesSum() {
            Receipt[] receipts = {
                    new Receipt("NR0012345", 30.0),
                    new Receipt("NR0012346", 40.0),
            };
            ReceiptCalculator calculator = new ReceiptCalculator();
            double totalSum = calculator.calculateTotalSalesSum(receipts);
            checkResult(totalSum, 70.00, "testCalculateTotalSalesSum");
        }

    public void testCalculateAverageSalesSum() {
            Receipt[] receipts = {
                    new Receipt("NRN0012345", 30.0),
                    new Receipt("NRN0012346", 40.0),
            };
            ReceiptCalculator calculator = new ReceiptCalculator();
            double averageReceiptSum = calculator.calculateAverageSalesSum(receipts);
            checkResult(averageReceiptSum, 35.0, "testAverageSalesSum");
        }


        private void checkResult(double realResult,
        double expectedResult,
        String testScenarioName) {
            double threshold = 0.000001d;
            if (Math.abs(realResult - expectedResult) < threshold) {
                System.out.println(testScenarioName + ": TEST OK!");
            } else {
                System.out.println(testScenarioName + ": TEST FAIL!");
            }
        }
}

