package lv.javaguru.java1.student_alexey_kosmachev.lesson_9.homework.day_1;

public class FraudDetector {

Trader trader = new Trader("Pokemon", "Riga");

    boolean isFraud(boolean t) {
        Transaction transaction = new Transaction(trader, 2000);
        if (trader.getFullName().equals("Pokemon"))
        {return false;} else {return true;}
    }

    }



