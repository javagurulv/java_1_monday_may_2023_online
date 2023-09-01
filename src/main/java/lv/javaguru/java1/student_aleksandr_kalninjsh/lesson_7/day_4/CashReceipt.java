package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_7.day_4;

class CashReceipt {

    String checkNumber;
    double purchaseAmount;

    public CashReceipt(String checkNumber, double purchaseAmount) {
        this.checkNumber = checkNumber;
        this.purchaseAmount = purchaseAmount;
    }
    String getCheckNumber() {
        return checkNumber;
    }
    double getPurchaseAmount() {
        return purchaseAmount;
    }
}
