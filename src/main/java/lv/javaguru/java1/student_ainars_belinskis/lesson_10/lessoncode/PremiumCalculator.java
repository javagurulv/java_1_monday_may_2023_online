package lv.javaguru.java1.student_ainars_belinskis.lesson_10.lessoncode;

import java.math.BigDecimal;
import java.util.List;

public class PremiumCalculator {

    private static final BigDecimal DEFAULT_COEFFICIENT_THEFT = new BigDecimal("0.11");
    private static final BigDecimal COEFFICIENT_THEFT = new BigDecimal("0.05");
    private static final BigDecimal SUM_INSURED_THEFT_THRESHOLD = new BigDecimal("15");

    private static final BigDecimal DEFAULT_COEFFICIENT_FIRE = new BigDecimal("0.014");
    private static final BigDecimal COEFFICIENT_FIRE = new BigDecimal("0.024");
    private static final BigDecimal SUM_INSURED_FIRE_THRESHOLD = new BigDecimal("100");


    // new risk type
    // coefficient change
    // show client premium parts
    // skindki

    public BigDecimal calculate(Policy policy) {
        BigDecimal premium = BigDecimal.ZERO;
        for (InsuredObject object : policy.getObjects()) {
            BigDecimal insuredObjectPremium = calculateInsuredObjectPremium(object);
            premium = premium.add(insuredObjectPremium);
        }
        return premium;
    }

    private BigDecimal calculateInsuredObjectPremium(InsuredObject object) {
        BigDecimal premiumFire = calculatePremiumFire(object);
        BigDecimal premiumTheft = calculatePremiumTheft(object);
        return premiumFire.add(premiumTheft);
    }

    private BigDecimal calculatePremiumFire(InsuredObject object) {
        BigDecimal sumInsuredFire = calculateSumInsuredFire(object);
        BigDecimal coefficientFire = selectCoefficientFire(sumInsuredFire);
        return sumInsuredFire.multiply(coefficientFire);
    }

    private BigDecimal selectCoefficientFire(BigDecimal sumInsuredFire) {
        return sumInsuredFire.compareTo(SUM_INSURED_FIRE_THRESHOLD) > 0
                ?  COEFFICIENT_FIRE
                :  DEFAULT_COEFFICIENT_FIRE;
/*
        BigDecimal oneHundred = new BigDecimal("100");
        BigDecimal coefficentFire = new BigDecimal("0.014");
        if (sumInsuredFire.compareTo(oneHundred) > 0) {
            coefficentFire = new BigDecimal("0.024");
        }
        return coefficentFire;
*/
    }

    private BigDecimal calculateSumInsuredFire(InsuredObject object) {
        BigDecimal sumInsuredFire = BigDecimal.ZERO;
        for (InsuredSubObject subObject : object.getSubObjects()) {
            List<RiskType> subObjectRisks = subObject.getRisks();
            if (subObjectRisks.contains(RiskType.FIRE)) {
                sumInsuredFire = sumInsuredFire.add(subObject.getSum());
            }
        }
        return sumInsuredFire;
    }

    private BigDecimal calculatePremiumTheft(InsuredObject object) {
        BigDecimal sumInsuredTheft = calculateSumInsuredTheft(object);
        BigDecimal coefficientTheft = selectCoefficientTheft(sumInsuredTheft);
        return sumInsuredTheft.multiply(coefficientTheft);
    }

    private BigDecimal selectCoefficientTheft(BigDecimal sumInsuredTheft) {
        return sumInsuredTheft.compareTo(SUM_INSURED_THEFT_THRESHOLD) >= 0
                ?  COEFFICIENT_THEFT
                :  DEFAULT_COEFFICIENT_THEFT;
/*
        BigDecimal coefficentTheft = DEFAULT_COEFFICIENT_THEFT;
        if (sumInsuredTheft.compareTo(SUM_INSURED_THEFT_THRESHOLD) > 0) {
            coefficentTheft = COEFFICIENT_THEFT;
        }
        return coefficentTheft;
*/
    }

    private BigDecimal calculateSumInsuredTheft(InsuredObject object) {
        BigDecimal sumInsuredTheft = BigDecimal.ZERO;
        for (InsuredSubObject subObject : object.getSubObjects()) {
            List<RiskType> subObjectRisks = subObject.getRisks();
            if (subObjectRisks.contains(RiskType.THEFT)) {
                sumInsuredTheft = sumInsuredTheft.add(subObject.getSum());
            }
        }
        return sumInsuredTheft;
    }

}
