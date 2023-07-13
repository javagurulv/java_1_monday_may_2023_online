package lv.javaguru.java1.student_butrin_ilya.lesson_6.homework.day4;

import java.math.BigInteger;

class FactorialForLoop {

    public BigInteger factorial(BigInteger n) {
        BigInteger result = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.equals(n) || (i.compareTo(n) < 0); i = i.add(BigInteger.valueOf(1))) {
            result = result.multiply(i);
        }
        return result;
    }

}
