package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_7.homework.day_4;

import org.jetbrains.annotations.NotNull;

class ReceiptCalc {

    public double TotalSum(CashReceipt @NotNull [] receipts) {
        double totalSum = 0.0;
        for (int i = 0; i < receipts.length; i++) {
            CashReceipt receipt = receipts[i];
            totalSum += receipt.getReceiptSum();
        }
        return totalSum;
    }
    public double AvgSum(CashReceipt[] receipts) {
            double ReceiptSum = 0.0; double totalSum = 0.0;
            for (int i = 0; i < receipts.length; i++) {
                CashReceipt receipt = receipts[i];
                ReceiptSum += receipt.getReceiptNumber();
                totalSum += receipt.getReceiptSum();
            }
            return totalSum/ReceiptSum;

    }

}
