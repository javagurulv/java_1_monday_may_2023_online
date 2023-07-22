package lv.javaguru.java1.student_butrin_ilya.lesson_7.homework.day4;

import java.util.ArrayList;
import java.util.List;

public class TotalAndAverageReceptApp {
    public static void main(String[] args) {
        TotalAndAverageRecept totalAndAverageRecept = new TotalAndAverageRecept();
        List<CashReceipt> receipts = new ArrayList<>();
        receipts.add(new CashReceipt(1, 101));
        receipts.add(new CashReceipt(2, 202));
        receipts.add(new CashReceipt(3, 303));
        receipts.add(new CashReceipt(4, 404));

        System.out.println(totalAndAverageRecept.sum(receipts));
        System.out.println(totalAndAverageRecept.average(receipts));

    }
}
