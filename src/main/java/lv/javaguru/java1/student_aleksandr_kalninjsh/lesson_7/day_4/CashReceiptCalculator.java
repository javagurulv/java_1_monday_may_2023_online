package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_7.day_4;

import java.util.ArrayList;
import java.util.List;

class CashReceiptCalculator {

    public double calculateTotalSalesSum(List<CashReceipt> receipts) {
        double totalSum = 0.0;
        for (int i = 0; i < receipts.size(); i++) {
            CashReceipt receipt = receipts.get(i);
            totalSum += receipt.getPurchaseAmount();
        }
        return totalSum;
    }

    public double calculateAverageReceiptSum(List<CashReceipt> receipts) {
        if (receipts.size() == 0) {
            return 0.0;
        }
            double totalSum = 0.0;
            for (int i = 0; i < receipts.size(); i++) {
                CashReceipt receipt = receipts.get(i);
                totalSum += receipt.getPurchaseAmount();
            }
            return totalSum / receipts.size();

        }
    }
