package lv.javaguru.java1.student_butrin_ilya.lesson_5.classwork;

import java.math.BigInteger;

public class Factorial {

    public BigInteger findFactorial (int n){
        BigInteger rezult = BigInteger.ONE;
        for (int x = 1; x <= n; x++) {
            rezult = rezult.multiply(BigInteger.valueOf(x));
        }
        return rezult;
    }


    public BigInteger findFactorialRecursion(int n) {
        BigInteger factorialx = BigInteger.ONE;
        BigInteger rezult = BigInteger.ONE;
        if (n == 0) {
            return factorialx;
        }
         rezult  = findFactorialRecursion(n-1).multiply(BigInteger.valueOf(n));
        return rezult;
    }
}