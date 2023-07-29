package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_4;


class ReceiptCalculator {


    public double calculateTotalSalesSum(Receipt[] receipts) {
        double sum = 0.0;
        for (int i = 0; i < receipts.length; i++) {
            Receipt receipt = receipts[i];
            sum += receipt.getSum();
        }
        return sum;
    }

    public double calculateAverageSalesSum(Receipt[] receipts) {
        if (receipts.length == 0) {
            return 0.0;
        } else {
            double sum = calculateTotalSalesSum(receipts);
            return sum / receipts.length;
        }
    }
}

