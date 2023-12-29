package lv.javaguru.java1.student_alexey_kosmachev.lesson_9.homework.day_1;

class FraudDetectorTest {

    // Germany > 1000
    // Germany < 1000
    // Latvia > 1000
    //Latvia < 1000
    // name Alexey

    public static void main(String[] args) {

        FraudDetectorTest test = new FraudDetectorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();
        test.test8();
        test.test9();
        test.test10();
        test.test11();
        test.test12();

    }
    public void test1 () {
        Trader trader = new Trader("Alexey","Riga","");
        Transaction t = new Transaction(trader,2000);
        FraudDetector word1 = new FraudDetector();
        if (word1.isFraud(t) == false) {System.out.println("OK! Transaction passed for Alexey");}
        else {System.out.println("TEST FAIL!");}

    }
    public void test2 () {
        Trader trader = new Trader("Pokemon","Riga","");
        Transaction t = new Transaction(trader,2000);
        FraudDetector word2 = new FraudDetector();
        if (word2.isFraud(t) == true) {System.out.println("FAIl! Transaction declined for Pokemon");}
        else {System.out.println("TEST FAIL!");}
    }

    public void test3 () {
        Trader trader = new Trader("Alexey","Riga","");
        Transaction t = new Transaction(trader,2000);
        FraudDetector amount1 = new FraudDetector();
        if (amount1.Rule2(t) == false) {System.out.println("OK! Transaction passed for less than 10K");}
        else {System.out.println("TEST FAIL!");}
    }

    public void test4 () {
        Trader trader = new Trader("Pokemon","Riga","");
        Transaction t = new Transaction(trader,12000);
        FraudDetector amount2 = new FraudDetector();
        if (amount2.Rule2(t) == true) {System.out.println("FAIL! Transaction declined for more than 10K");}
        else {System.out.println("TEST FAIL!");}
    }

    public void test5 () {
        Trader trader = new Trader("Alexey","Riga","");
        Transaction t = new Transaction(trader,2000);
        FraudDetector word1 = new FraudDetector();
        if (word1.Rule3(t) == false) {System.out.println("OK! Transaction passed from Riga");}
        else {System.out.println("TEST FAIL!");}

    }
    public void test6 () {
        Trader trader = new Trader("Pokemon","Sydney","");
        Transaction t = new Transaction(trader,2000);
        FraudDetector word2 = new FraudDetector();
        if (word2.Rule3(t) == true) {System.out.println("FAIl! Transaction declined from Sydney");}
        else {System.out.println("TEST FAIL!");}
    }

    public void test7 () {
        Trader trader = new Trader("","","Latvia");
        Transaction t = new Transaction(trader,2000);
        FraudDetector word1 = new FraudDetector();
        if (word1.Rule4(t) == false) {System.out.println("OK! Transaction passed from Latvia");}
        else {System.out.println("TEST FAIL!");}

    }
    public void test8 () {
        Trader trader = new Trader("","","Jamaica");
        Transaction t = new Transaction(trader,2000);
        FraudDetector word2 = new FraudDetector();
        if (word2.Rule4(t) == true) {System.out.println("FAIl! Transaction declined from Jamaica");}
        else {System.out.println("TEST FAIL!");}
    }

    public void test9 () {
        Trader trader = new Trader("","","Germany");
        Transaction t = new Transaction(trader,2000);
        FraudDetector word1 = new FraudDetector();
        if (word1.Rule5(t) == true) {System.out.println("FAIL! Transaction declined from Germany more than 1000");}
        else {System.out.println("TEST FAIL!");}

    }
    public void test10 () {
        Trader trader = new Trader("","","Germany");
        Transaction t = new Transaction(trader,800);
        FraudDetector word2 = new FraudDetector();
        if (word2.Rule5(t) == false) {System.out.println("OK! Transaction passed from Germany less than 1000");}
        else {System.out.println("TEST FAIL!");}
    }

    public void test11 () {
        Trader trader = new Trader("","","Latvia");
        Transaction t = new Transaction(trader,2000);
        FraudDetector word1 = new FraudDetector();
        if (word1.Rule5(t) == false) {System.out.println("OK! Transaction passed from Latvia more than 1000");}
        else {System.out.println("TEST FAIL!");}

    }
    public void test12 () {
        Trader trader = new Trader("","","Latvia");
        Transaction t = new Transaction(trader,500);
        FraudDetector word2 = new FraudDetector();
        if (word2.Rule5(t) == false) {System.out.println("OK! Transaction passed from Latvia less than 1000");}
        else {System.out.println("TEST FAIL!");}
    }

    }

