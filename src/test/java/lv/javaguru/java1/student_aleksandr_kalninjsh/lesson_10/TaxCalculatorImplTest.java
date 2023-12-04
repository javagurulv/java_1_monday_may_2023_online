package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_10;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorImplTest {

    private TaxCalculator taxCalculator = new TaxCalculatorImpl();

    @Test
    public void shouldPayZeroTaxWhenIncomeZero() {
        var income = BigDecimal.ZERO;
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("0.00"));

    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeLessThen20000() {
        var income = new BigDecimal(10000);
        var taxPay = taxCalculator.calculateTax(income);
        assertEquals(taxPay, new BigDecimal("2500.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeEqualTo20000() {
        var income = new BigDecimal(20000);
        var taxPay = taxCalculator.calculateTax(income);
        assertEquals(taxPay, new BigDecimal("5000.00"));
    }

    @Test
    public void shouldPay40PercentTaxWhenIncomeBiggerThen20000() {
        var income = new BigDecimal(30000);
        var taxPay = taxCalculator.calculateTax(income);
        assertEquals(taxPay, new BigDecimal("9000.00"));
    }


}