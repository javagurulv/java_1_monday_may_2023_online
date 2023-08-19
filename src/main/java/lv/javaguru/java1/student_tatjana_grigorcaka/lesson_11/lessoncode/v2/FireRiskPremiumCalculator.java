package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.lessoncode.v2;

import lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.lessoncode.InsuredObject;
import lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.lessoncode.InsuredSubObject;
import lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.lessoncode.RiskType;

import java.math.BigDecimal;
import java.util.List;

public class FireRiskPremiumCalculator {

    private static final  BigDecimal DEFAULT_COEFFICIENT_FIRE = new BigDecimal("0.014");
    private static final  BigDecimal COEFFICIENT_FIRE = new BigDecimal("0.024");
    private static final  BigDecimal SUM_INSURED_FIRE_THRESHOLD = new BigDecimal("100");


    BigDecimal calculatePremiumFire(InsuredObject object) {
        BigDecimal sumInsuredFire = calculateSumInsuredFire(object);
        BigDecimal coefficientFire = selectCoefficientFire(sumInsuredFire);
        return sumInsuredFire.multiply(coefficientFire);
    }



    private BigDecimal selectCoefficientFire(BigDecimal sumInsuredFire) {
        return sumInsuredFire.compareTo(SUM_INSURED_FIRE_THRESHOLD) > 0
                ? COEFFICIENT_FIRE
                : DEFAULT_COEFFICIENT_FIRE;
/*
        BigDecimal coefficientFire = new BigDecimal("0.014");
        BigDecimal oneHundred = new BigDecimal ("100");
        if (sumInsuredFire.compareTo(oneHundred) > 0 ) {
            coefficientFire = new BigDecimal("0.024");
        }
        return coefficientFire;
 */
    }

    private BigDecimal calculateSumInsuredFire(InsuredObject object) {
        BigDecimal sumInsuredFire = BigDecimal.ZERO;
        for (InsuredSubObject subObject : object.getSubObjects()) {
            List<RiskType> subObjectRisks = subObject.getRisks();
            if(subObjectRisks.contains(RiskType.FIRE)) {
                sumInsuredFire = sumInsuredFire.add(subObject.getSum());
            }
        }
        return sumInsuredFire;
    }

}
