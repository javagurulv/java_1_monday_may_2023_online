package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_7.day_4;

import java.util.ArrayList;
import java.util.List;

class ReceiptCalculatorTest {

    public static void main(String[] args) {

        CashReceipt receipt1 = new CashReceipt("N145464", 65.5);
        CashReceipt receipt2 = new CashReceipt("N245464", 35.0);
        List<CashReceipt> receipts = new ArrayList<>();
        receipts.add(receipt1);
        receipts.add(receipt2);

        ReceiptCalculatorTest receiptCalculatorTest = new ReceiptCalculatorTest();
        receiptCalculatorTest.calculateTotalSalesSum(receipts);
        receiptCalculatorTest.calculateAverageReceiptSum(receipts);

    }
    public void calculateTotalSalesSum(List<CashReceipt> receipts) {
        CashReceiptCalculator cashReceiptCalculator = new CashReceiptCalculator();
        double expectedResult = 100.5;
        double actualResult = cashReceiptCalculator.calculateTotalSalesSum(receipts);
        if(actualResult == expectedResult) {
            System.out.println("Total sales sum test = OK");
        }
        else {
            System.out.println("Total sales sum test = FAIL");
        }
    }

    public void calculateAverageReceiptSum(List<CashReceipt> receipts) {
        CashReceiptCalculator cashReceiptCalculator = new CashReceiptCalculator();
        double expectedResult = 50.25;
        double actualResult = cashReceiptCalculator.calculateAverageReceiptSum(receipts);
        if(actualResult == expectedResult) {
            System.out.println("Total sales sum test = OK");
        }
        else {
            System.out.println("Total sales sum test = FAIL");
        }

    }
}
