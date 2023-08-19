package lv.javaguru.java1.student_timur_geldiev.lesson_9.classwork.v2;

import lv.javaguru.java1.student_timur_geldiev.lesson_9.classwork.PremiumCalculator;
import lv.javaguru.java1.teacher.lesson_11_interfaces.lessoncode.InsuredObject;
import lv.javaguru.java1.teacher.lesson_11_interfaces.lessoncode.Policy;

import java.math.BigDecimal;

public class PremiumCalculatorV2Impl implements PremiumCalculator {

    private FireRiskPremiumCalculator fireRiskPremiumCalculator = new FireRiskPremiumCalculator();
    private TheftRiskPremiumCalculator theftRiskPremiumCalculator = new TheftRiskPremiumCalculator();

    @Override
    public BigDecimal calculate(Policy policy) {
        BigDecimal premium = BigDecimal.ZERO;
        for (InsuredObject object : policy.getObjects()) {
            BigDecimal insuredObjectPremium = calculateInsuredObjectPremium(object);
            premium = premium.add(insuredObjectPremium);
        }
        return premium;
    }

    private BigDecimal calculateInsuredObjectPremium(InsuredObject object) {
        BigDecimal premiumFire = fireRiskPremiumCalculator.calculatePremiumFire(object);
        BigDecimal premiumTheft = theftRiskPremiumCalculator.calculatePremiumTheft(object);
        return premiumFire.add(premiumTheft);
    }

}
