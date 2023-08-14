package lv.javaguru.java1.teacher.lesson_11_interfaces.lessoncode.v3;

import lv.javaguru.java1.teacher.lesson_11_interfaces.lessoncode.InsuredObject;
import lv.javaguru.java1.teacher.lesson_11_interfaces.lessoncode.Policy;
import lv.javaguru.java1.teacher.lesson_11_interfaces.lessoncode.PremiumCalculator;

import java.math.BigDecimal;
import java.util.List;

public class PremiumCalculatorV3Impl implements PremiumCalculator {

    private List<RiskPremiumCalculator> riskPremiumCalculators =
            List.of(
                    new FireRiskPremiumCalculator(),
                    new TheftRiskPremiumCalculator()
            );

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
        BigDecimal objectPremium = BigDecimal.ZERO;
        for (RiskPremiumCalculator premiumCalculator : riskPremiumCalculators) {
            BigDecimal riskPremium = premiumCalculator.calculatePremium(object);
            objectPremium = objectPremium.add(riskPremium);
        }
        return objectPremium;
    }

}
