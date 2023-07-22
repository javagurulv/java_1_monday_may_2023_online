package lv.javaguru.java1.student_butrin_ilya.lesson_7.homework.day4;

import java.util.ArrayList;
import java.util.List;

public class CashReceiptTest {
    public static void main(String[] args) {
        CashReceiptTest test = new CashReceiptTest();
        test.summmaTest();
        test.AverageTest();
    }

    public void summmaTest() {
        TotalAndAverageRecept totalAndAverageRecept = new TotalAndAverageRecept();
        double realrezult = 1500;
        List<CashReceipt> receipts = new ArrayList<>();
        receipts.add(new CashReceipt(1, 100));
        receipts.add(new CashReceipt(2, 200));
        receipts.add(new CashReceipt(3, 300));
        receipts.add(new CashReceipt(4, 400));
        receipts.add(new CashReceipt(5, 500));
        double expectedrezult = totalAndAverageRecept.sum(receipts);
        if (realrezult == expectedrezult) System.out.println("ok");
        else System.out.println("no");
    }

    public void AverageTest() {
        TotalAndAverageRecept totalAndAverageRecept = new TotalAndAverageRecept();
        double realrezult = 300;
        List<CashReceipt> receipts = new ArrayList<>();
        receipts.add(new CashReceipt(1, 100));
        receipts.add(new CashReceipt(2, 200));
        receipts.add(new CashReceipt(3, 300));
        receipts.add(new CashReceipt(4, 400));
        receipts.add(new CashReceipt(5, 500));
        double expectedrezult = totalAndAverageRecept.average(receipts);
        if (realrezult == expectedrezult) System.out.println("ok");
        else System.out.println("no");

    }
}
