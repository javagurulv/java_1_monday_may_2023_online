package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_10.lessoncode.version_2_divisionIntoClasses;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PremiumCalculatorTest {

/*
    private PremiumCalculator premiumCalculator = new PremiumCalculator();

    @Test
    public void oneObjectOneSubObjectFireSumInsuredUnder100() {
        InsuredSubObject tv = createSubObject("TV", "99.50", RiskType.FIRE);
        InsuredObject object = createInsuredObject("House 1", tv);
        Policy policy = createPolicy("LV20-02-100000-5", PolicyStatus.REGISTERED, object);
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal("1.39").stripTrailingZeros(),
                premium.stripTrailingZeros());

    }
    @Test
    public void oneObjectOneSubObjectFireSumInsured100() {
        InsuredSubObject tv = createSubObject("TV", "100.00",RiskType.FIRE);
        InsuredObject object = createInsuredObject("House 1", tv);
        Policy policy = createPolicy("LV20-02-100000-5", PolicyStatus.REGISTERED, object);
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal("1.40").stripTrailingZeros(),
                premium.stripTrailingZeros());
    }
    @Test
    public void oneObjectOneSubObjectFireSumInsuredOver100() {
        InsuredSubObject tv = createSubObject("TV", "1000.50", RiskType.FIRE);
        InsuredObject object = createInsuredObject("House 1", tv);
        Policy policy = createPolicy("LV20-02-100000-5", PolicyStatus.REGISTERED, object);
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal("24.01").stripTrailingZeros(),
                premium.stripTrailingZeros());
    }

    @Test
    public void oneObjectTwoSubObjectsFireSumInsuredOver100() {
        InsuredSubObject tv = createSubObject("TV", "1000.50", RiskType.FIRE);
        InsuredSubObject fridge = createSubObject("Fridge", "500.00", RiskType.FIRE);
        InsuredObject object = createInsuredObject("House 1", tv,fridge);
        Policy policy = createPolicy("LV20-02-100000-5", PolicyStatus.REGISTERED, object);
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal("36.01").stripTrailingZeros(),
                premium.stripTrailingZeros());
    }

    @Test
    public void oneObjectOneSubObjectTheftSumInsuredUnder15() {
        InsuredSubObject wallClock = createSubObject("Wall Clock", "8.00", RiskType.THEFT);
        InsuredObject object = createInsuredObject("House 1", wallClock);
        Policy policy = createPolicy("LV20-02-100000-5", PolicyStatus.REGISTERED, object);
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal("0.88").stripTrailingZeros(),
                premium.stripTrailingZeros());
    }

    @Test
    public void oneObjectOneSubObjectTheftSumInsured15() {
        InsuredSubObject wallClock = createSubObject("Wall Clock", "15.00", RiskType.THEFT);
        InsuredObject object = createInsuredObject("House 1", wallClock);
        Policy policy = createPolicy("LV20-02-100000-5", PolicyStatus.REGISTERED, object);
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal("0.75").stripTrailingZeros(),
                premium.stripTrailingZeros());
    }

    @Test
    public void oneObjectOneSubObjectTheftSumInsuredOver15() {
        InsuredSubObject blender = createSubObject("Blender", "50.51", RiskType.THEFT);
        InsuredObject object = createInsuredObject("House 1", blender);
        Policy policy = createPolicy("LV20-02-100000-5", PolicyStatus.REGISTERED, object);
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal("2.53").stripTrailingZeros(),
                premium.stripTrailingZeros());
    }

    @Test
    public void oneObjectTwoSubObjectsTheftSumInsuredOver15() {
        InsuredSubObject wallClock = createSubObject("Wall Clock", "35.00", RiskType.THEFT);
        InsuredSubObject blender = createSubObject("Blender", "50.51", RiskType.THEFT);
        InsuredObject object = createInsuredObject("House 1", wallClock, blender);
        Policy policy = createPolicy("LV20-02-100000-5", PolicyStatus.REGISTERED, object);
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal("4.28").stripTrailingZeros(),
                premium.stripTrailingZeros());
    }

    private static Policy createPolicy(String number,
                                       PolicyStatus status,
                                       InsuredObject... objects) {
        return new Policy(
                number,
                status,
                Arrays.stream(objects).toList()
        );
    }

    private static InsuredObject createInsuredObject(String name, InsuredSubObject... subObjects) {
        return new InsuredObject(
                name,
                Arrays.stream(subObjects).toList()
        );
    }

    private static InsuredSubObject createSubObject(String name,
                                                    String sumInsured,
                                                    RiskType... riskTypes) {
        return new InsuredSubObject(
                name,
                new BigDecimal(sumInsured),
                Arrays.stream(riskTypes).toList()
        );
    }
*/
}
