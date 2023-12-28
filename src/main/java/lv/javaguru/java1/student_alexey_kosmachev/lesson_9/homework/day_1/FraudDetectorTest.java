package lv.javaguru.java1.student_alexey_kosmachev.lesson_9.homework.day_1;

class FraudDetectorTest {

    // name Pokemon
    // name Alexey

    public static void main(String[] args) {

        FraudDetectorTest test = new FraudDetectorTest();
        test.test1();
        test.test2();
    }
    public void test1 () {
        Trader trader = new Trader("Alexey","Riga");
        Transaction t = new Transaction(trader,2000);
        FraudDetector word1 = new FraudDetector();
        if (word1.isFraud(t) == false) {System.out.println("TEST OK!");}
        else {System.out.println("TEST FAIL!");}

    }
    public void test2 () {
        Trader trader = new Trader("Pokemon","Riga");
        Transaction t = new Transaction(trader,2000);
        FraudDetector word2 = new FraudDetector();
        if (word2.isFraud(t) == true) {System.out.println("TEST OK!");}
        else {System.out.println("TEST FAIL!");}
    }

    }

