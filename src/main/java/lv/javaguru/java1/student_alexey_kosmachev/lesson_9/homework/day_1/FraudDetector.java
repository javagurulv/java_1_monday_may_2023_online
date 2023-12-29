package lv.javaguru.java1.student_alexey_kosmachev.lesson_9.homework.day_1;

public class FraudDetector {
    boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon"))
            return true;
        return false;
    }

    boolean Rule2(Transaction t) {
        if (t.getAmount() > 10000)
            return true;
        return false;
    }

    boolean Rule3(Transaction t) {
        if (t.getTrader().getCity().equals("Sydney"))
            return true;
        return false;
    }

    boolean Rule4(Transaction t) {
        if (t.getTrader().getCountry().equals("Jamaica"))
            return true;
        return false;
    }

    boolean Rule5(Transaction t) {
        if (t.getTrader().getCountry().equals("Germany") & (t.getAmount() > 1000))
            return true;
        return false;

    }

}



