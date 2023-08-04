package lv.javaguru.java1.student_timur_geldiev.lesson_9.classwork.lesson9Tests;

import lv.javaguru.java1.student_timur_geldiev.lesson_9.homework.day_1.*;

public class FraudRule1Test {
    public static void main(String[] args) {
        Trader trader1 = new Trader("SuperNotScamTrader", "Fairland", "NotScammington");
        Trader trader2 = new Trader("Pokemon", "Japan", "Tokio");
        Transaction t1 = new Transaction(trader1, 10000);
        Transaction t2 = new Transaction(trader2, 99999);

        FraudRule1Test test = new FraudRule1Test();

//        test.checkIfNotFraud(t1);
//        test.checkIfFraud(t2);

    }

//    public void checkIfNotFraud(Transaction t) {
//        boolean expected = false;
//        FraudRule1 detector = new FraudRule1(isFraud(t));
//        boolean actual = detector.isFraud(t);
//        if (actual == expected) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
//        }
//    }

//    public void checkIfFraud(Transaction t) {
//        boolean expected = true;
//        FraudDetector detector = new FraudDetector();
//        boolean actual = detector.isFraud(t);
//        if (actual == expected) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
//        }
//    }
}
