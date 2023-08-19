package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.lessoncode.v2;

import lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.lessoncode.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class PremiumCalculatorV2Impl implements PremiumCalculator {

    @Override
    public BigDecimal calculate(Policy policy) {
        BigDecimal premium = BigDecimal.ZERO;
        for (InsuredObject object : policy.getObjects()) {
            BigDecimal insuredObjectPremium = calculateInsuredObjectPremium(object);
            premium = premium.add(insuredObjectPremium);
            premium = new
                    BigDecimal(String.valueOf(premium)).setScale(2, RoundingMode.HALF_UP);
        }
        return premium;
    }

    private BigDecimal calculateInsuredObjectPremium(InsuredObject object) {
        FireRiskPremiumCalculator fireRiskPremiumCalculator  = new FireRiskPremiumCalculator();
        BigDecimal premiumFire = fireRiskPremiumCalculator.calculatePremiumFire(object);
        TheftRiskPremiumCalculator theftRiskPremiumCalculator  = new TheftRiskPremiumCalculator();
        BigDecimal premiumTheft = theftRiskPremiumCalculator.calculatePremiumTheft(object);
        return premiumFire.add(premiumTheft);
    }
}
