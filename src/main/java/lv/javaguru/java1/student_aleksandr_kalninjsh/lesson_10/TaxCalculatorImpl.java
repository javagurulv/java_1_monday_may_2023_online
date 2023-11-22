package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_10;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(new BigDecimal("20000")) <= 0) {
            return income.multiply(new BigDecimal("0.25"));
        } else {
            var incomeBiggerThen20000 = income.subtract(new BigDecimal("20000"));
                var taxAfter20000 = incomeBiggerThen20000.multiply(new BigDecimal("0.40"));
                var taxBefore20000 = new BigDecimal("20000").multiply(new BigDecimal("0.25"));
                return taxBefore20000.add(taxAfter20000);

        }


    }



}
