package lv.javaguru.java1.student_alexey_kosmachev.lesson_9.homework.day_1;

import lv.javaguru.java1.student_alexey_kosmachev.lesson_6.homework.day_4.FactorialRecursionTest;

class FraudDetectorTest {

    // Pokemon = False
    // Dmitry = True

    public static void main(String[] args) {

        FactorialRecursionTest test = new FactorialRecursionTest();
        test.test1();
        test.test2();
    }
    public void test1 () {
        FraudDetector word1 = new FraudDetector();
        if (word1.isFraud(true)) {System.out.println("TEST OK!");}
        else {System.out.println("TEST FAIL!");}
    }
    public void test2 () {
        FraudDetector word2 = new FraudDetector();
        if (!word2.isFraud(false)) {System.out.println("TEST OK!");}
        else {System.out.println("TEST FAIL!");}
    }

    }

