package lv.javaguru.java1.student_butrin_ilya.lesson_9.policy;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PremiumCalculatorTest {
    PremiumCalculator premiumCalculator = new PremiumCalculator();
    @Test
    public void test1 (){
        SubObject tv = new SubObject("tv", new BigDecimal(10.00) , List.of(RiskType.FIRE));
        Object home1 = new Object("home", List.of(tv));
        Policy policy = new Policy("1 - lv - 456", StatusPolicy.ACTIVE, List.of(home1));
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal(0.14), premium.setScale(2, RoundingMode.HALF_DOWN));
    }
    @Test
    public void test2 (){

    }

}