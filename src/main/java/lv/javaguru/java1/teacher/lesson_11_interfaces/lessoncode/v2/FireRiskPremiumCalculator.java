package lv.javaguru.java1.teacher.lesson_11_interfaces.lessoncode.v2;

import lv.javaguru.java1.teacher.lesson_11_interfaces.lessoncode.InsuredObject;
import lv.javaguru.java1.teacher.lesson_11_interfaces.lessoncode.InsuredSubObject;
import lv.javaguru.java1.teacher.lesson_11_interfaces.lessoncode.RiskType;

import java.math.BigDecimal;
import java.util.List;

class FireRiskPremiumCalculator {

    private static final BigDecimal DEFAULT_COEFFICIENT_FIRE = new BigDecimal("0.014");
    private static final BigDecimal COEFFICIENT_FIRE = new BigDecimal("0.024");
    private static final BigDecimal SUM_INSURED_FIRE_THRESHOLD = new BigDecimal("100");

    BigDecimal calculatePremiumFire(InsuredObject object) {
        BigDecimal sumInsuredFire = calculateSumInsuredFire(object);
        BigDecimal coefficientFire = selectCoefficientFire(sumInsuredFire);
        return sumInsuredFire.multiply(coefficientFire);
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

    private BigDecimal selectCoefficientFire(BigDecimal sumInsuredFire) {
        return sumInsuredFire.compareTo(SUM_INSURED_FIRE_THRESHOLD) > 0
                ?  COEFFICIENT_FIRE
                :  DEFAULT_COEFFICIENT_FIRE;
    }

}
