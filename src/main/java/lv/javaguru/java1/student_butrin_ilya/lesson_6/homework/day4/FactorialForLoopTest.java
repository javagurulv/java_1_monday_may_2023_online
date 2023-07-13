package lv.javaguru.java1.student_butrin_ilya.lesson_6.homework.day4;

import java.math.BigInteger;

public class FactorialForLoopTest {
    FactorialForLoop factorialForLoop = new FactorialForLoop();
    public static void main(String[] args) {
        FactorialForLoopTest test = new FactorialForLoopTest();
        test.factorialTest();
        test.factorialZeroTest();
        test.factorialOneTest();
        test.factorialBigNumberTest();

    }

    public void factorialTest() {
        BigInteger realRezult = BigInteger.valueOf(120);
        BigInteger expectedRezult = factorialForLoop.factorial(BigInteger.valueOf(5));
        checkRezult(realRezult, expectedRezult, "FactorialTest");
    }

    public void factorialZeroTest() {
        BigInteger realRezult = BigInteger.valueOf(1);
        BigInteger expectedRezult = factorialForLoop.factorial(BigInteger.valueOf(0));
        checkRezult(realRezult, expectedRezult, "FactorialZeroTest");
    }
    public void factorialOneTest() {
        BigInteger realRezult =BigInteger.valueOf(1);
        BigInteger  expectedRezult = factorialForLoop.factorial(BigInteger.valueOf(1));
        checkRezult(realRezult, expectedRezult, "FactorialOneTest");
    }
    public void factorialBigNumberTest() {
        BigInteger realRezult = new BigInteger("30414093201713378043612608166064768844377641568960512000000000000");
        BigInteger expectedRezult = (factorialForLoop.factorial(BigInteger.valueOf(50)));
        checkRezult(realRezult, expectedRezult, "FactorialTestBig");
    }
    public void checkRezult (BigInteger real, BigInteger expected, String name) {
        if (real.equals(expected)) {
            System.out.println("test " + name + " is OK");
        } else {System.out.println("test " + name + " is FAIL" + " Reason: " + "realResult: " + real + " not equal expected result: " + expected);
        }

    }
}