package lv.javaguru.java1.student_butrin_ilya.lesson_7.homework.day4;

import java.util.ArrayList;
import java.util.List;

public class TotalAndAverageRecept {
    public double sum(List<CashReceipt> summa) {
        double sum = 0;
        for (int i = 0; i < summa.size(); i++) {
            CashReceipt cashReceipt = summa.get(i);
            double summma = cashReceipt.getSumma();
            sum = sum + summma;
        }
        return sum;
    }

    public double average(List<CashReceipt> average) {
        double sum = 0;
        double averag = 0;
        for (int i = 0; i < average.size(); i++) {
            CashReceipt cashReceipt = average.get(i);
            double summma = cashReceipt.getSumma();
            sum = sum + summma;
            averag = sum / average.size();
        }
        return averag;
    }
}

