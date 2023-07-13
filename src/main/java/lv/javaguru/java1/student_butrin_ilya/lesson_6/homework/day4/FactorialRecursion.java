package lv.javaguru.java1.student_butrin_ilya.lesson_6.homework.day4;

import java.math.BigInteger;

class FactorialRecursion {
    public static void main(String[] args) {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        System.out.println(factorialRecursion.factorial(BigInteger.valueOf(50)));

    }

    public BigInteger factorial(BigInteger n) {
        BigInteger num = BigInteger.ONE;
        if ((n.equals(BigInteger.valueOf(1))) || (n.equals(BigInteger.valueOf(0)))) {
            return num;
        }
        BigInteger rez = n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
        return rez;
    }

}




