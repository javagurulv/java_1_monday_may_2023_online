package lv.javaguru.java1.student_timur_geldiev.lesson_9.classwork.lesson9Tests;

import lv.javaguru.java1.student_timur_geldiev.lesson_9.homework.day_1.*;

public class FraudRule2Test {
    public static void main(String[] args) {
        Trader trader1 = new Trader("SuperNotScamTrader", "Fairland", "NotScammington");
        Trader trader2 = new Trader("Pokemon", "Japan","Tokio");

        Transaction t2 = new Transaction(trader2, 99999);
        Transaction t3 = new Transaction(trader1, 2000000);

        FraudRule2Test test = new FraudRule2Test();
//        test.checkIfTransactionMoreThanMillion(t3);
//        test.checkIfTransactionLessThanMillion(t2);
    }

//    public void checkIfTransactionMoreThanMillion(Transaction t) {
//        boolean expected = true;
//        FraudRule detector = new FraudRule();
//        boolean actual = detector.isMoreThanMillion(t);
//        if (actual == expected) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
//        }
//
//    }
//    public void checkIfTransactionLessThanMillion(Transaction t){
//        boolean expected = false;
//        FraudDetector detector = new FraudDetector();
//        boolean actual = detector.isMoreThanMillion(t);
//        if (actual == expected) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
//        }
//    }
}
