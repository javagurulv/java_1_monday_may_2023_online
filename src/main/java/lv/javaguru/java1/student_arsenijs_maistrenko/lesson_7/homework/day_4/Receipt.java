package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_7.homework.day_4;

class Receipt {
    int receiptNumber;
    double receiptSum;
    public Receipt (int receiptNumber, double receiptSum) {
        this.receiptNumber = receiptNumber;
        this.receiptSum = receiptSum;
    }
    public int getReceiptNumber() {return receiptNumber;}
    public double getReceiptSum() {return receiptSum;}

}
