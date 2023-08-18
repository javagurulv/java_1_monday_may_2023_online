package lv.javaguru.java1.student_timur_geldiev.lesson_9.classwork.premiumCalculatorTest;

import lv.javaguru.java1.student_timur_geldiev.lesson_9.classwork.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PremiumCalculatorImplTest {
    private static Policy policy;

    @BeforeEach
    void setUp() {
        InsuredSubObject tv = new InsuredSubObject("TV", new BigDecimal("1000.50"), List.of(RiskType.FIRE));
        InsuredSubObject fridge = new InsuredSubObject("FRIDGE", new BigDecimal("500.00"), List.of(RiskType.FIRE, RiskType.THEFT));

        InsuredSubObject vacuumCleaner = new InsuredSubObject("Vacuum cleaner", new BigDecimal("300"), List.of(RiskType.FIRE, RiskType.THEFT));
        InsuredSubObject washingMachine = new InsuredSubObject("Washing Machine", new BigDecimal("850.99"), List.of(RiskType.THEFT));
        List<InsuredSubObject> subObjects1 = new ArrayList<>();
        subObjects1.add(tv);
        subObjects1.add(fridge);

        List<InsuredSubObject> subObjects2 = new ArrayList<>();
        subObjects2.add(vacuumCleaner);
        subObjects2.add(washingMachine);
        InsuredObject object1 = new InsuredObject("House 1", subObjects1);
        InsuredObject object2 = new InsuredObject("House 2", subObjects2);
        List<InsuredObject> objects = new ArrayList<>();
        objects.add(object1);
        objects.add(object2);

        policy = new Policy("LV-1", PolicyStatus.REGISTERED, objects);
    }

//    @Test
//    void calculateTotalPremium() {
//
//        PremiumCalculator calcTotal = new PremiumCalculator();
//        BigDecimal expected = BigDecimal.valueOf(125.76);
//        BigDecimal result = calcTotal.calculate(policy);
//        BigDecimal scaled = result.setScale(2, BigDecimal.ROUND_HALF_UP);
//        assertEquals(expected, scaled);
//
//    }

}