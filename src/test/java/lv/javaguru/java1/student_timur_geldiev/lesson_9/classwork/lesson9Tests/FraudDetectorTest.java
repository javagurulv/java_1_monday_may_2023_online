package lv.javaguru.java1.student_timur_geldiev.lesson_9.classwork.lesson9Tests;

import lv.javaguru.java1.student_timur_geldiev.lesson_9.homework.day_1.CountryRejection;
import lv.javaguru.java1.student_timur_geldiev.lesson_9.homework.day_1.FraudDetector;
import lv.javaguru.java1.student_timur_geldiev.lesson_9.homework.day_1.Trader;
import lv.javaguru.java1.student_timur_geldiev.lesson_9.homework.day_1.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FraudDetectorTest {

    public static void main(String[] args) {

        Trader trader1 = new Trader("SuperNotScamTrader", "Fairland", "NotScammington");
        Trader trader2 = new Trader("Pokemon", "Japan","Tokio");
        Trader trader3 = new Trader("Crocodile Dundee", "Australia","Sydney");
        Trader trader4 = new Trader("Marl Bobley", "Jamaica","Kingston");
        Trader trader5 = new Trader("Hanz Grinberg", "Germany","Berlin");
        Trader trader6 = new Trader("Heinz Heinrich", "Germany","Hamburg");

        Transaction t1 = new Transaction(trader1, 10000);
        Transaction t2 = new Transaction(trader2, 99999);
        Transaction t3 = new Transaction(trader1, 2000000);
        Transaction t4 = new Transaction(trader3, 999);
        Transaction t5 = new Transaction(trader4, 1000);
        Transaction t6 = new Transaction(trader5, 999);
        Transaction t7 = new Transaction(trader6, 1001);



        FraudDetectorTest test = new FraudDetectorTest();

        test.checkIfNotFraud(t1);
        test.checkIfFraud(t2);
        test.checkIfTransactionMoreThanMillion(t3);
        test.checkIfTransactionLessThanMillion(t2);
        test.checkTraderFromSydneyRejected(t4);
        test.checkTraderNotFromSydneyNotRejected(t2);
        test.checkTraderFromJamaicaRejected(t5);
        test.checkTraderNotFromJamaicaNotRejected(t3);
        test.checkUserFromGermanyAndLessThanThousand(t6);
        test.checkUserFromGermanyAndMoreThanThousand(t7);

    }

    public void checkIfNotFraud(Transaction t) {
        boolean expected = false;
        FraudDetector detector = new FraudDetector();
        boolean actual = detector.isFraud(t);
        if (actual == expected) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
        }
    }

    public void checkIfFraud(Transaction t) {
        boolean expected = true;
        FraudDetector detector = new FraudDetector();
        boolean actual = detector.isFraud(t);
        if (actual == expected) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
        }
    }

    public void checkIfTransactionMoreThanMillion(Transaction t) {
        boolean expected = true;
        FraudDetector detector = new FraudDetector();
        boolean actual = detector.isMoreThanMillion(t);
        if (actual == expected) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
        }

    }
    public void checkIfTransactionLessThanMillion(Transaction t){
        boolean expected = false;
        FraudDetector detector = new FraudDetector();
        boolean actual = detector.isMoreThanMillion(t);
        if (actual == expected) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
        }
    }

    public void checkTraderFromSydneyRejected(Transaction t) {
        boolean expected = true;
        CountryRejection detector = new CountryRejection();
        boolean actual = detector.isSydneyTrader(t);
        if (actual == expected) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
        }
    }
    public void checkTraderNotFromSydneyNotRejected(Transaction t){
        boolean expected = false;
        CountryRejection detector = new CountryRejection();
        boolean actual = detector.isSydneyTrader(t);
        if (actual == expected) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
        }
    }

//    @Test
//    void checkTraderFromSydneyRejected(Transaction t) {
//        boolean expected = true;
//        FraudDetector detector = new FraudDetector();
//        boolean actual = detector.isSydneyTrader(t);
//        assertEquals(expected, actual);
//    }
    public void checkTraderFromJamaicaRejected(Transaction t){
        boolean expected = true;
        CountryRejection detector = new CountryRejection();
        boolean actual = detector.isJamaica(t);
        if (actual == expected) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
        }
    }
    public void checkTraderNotFromJamaicaNotRejected(Transaction t){
        boolean expected = false;
        CountryRejection detector = new CountryRejection();
        boolean actual = detector.isJamaica(t);
        if (actual == expected) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
        }
    }
    public void checkUserFromGermanyAndLessThanThousand(Transaction t){
        boolean expected = false;
        CountryRejection detector = new CountryRejection();
        boolean actual = detector.isGermanyAndMoreThanThousand(t);
        if (actual == expected) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
        }
    }
    public void checkUserFromGermanyAndMoreThanThousand(Transaction t){
        boolean expected = true;
        CountryRejection detector = new CountryRejection();
        boolean actual = detector.isGermanyAndMoreThanThousand(t);
        if (actual == expected) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
        }
    }
}
