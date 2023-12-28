package lv.javaguru.java1.student_alexey_kosmachev.lesson_9.homework.day_1;

public class FraudDetector {
    boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon"))
            return true;
        return false;
    }
}



