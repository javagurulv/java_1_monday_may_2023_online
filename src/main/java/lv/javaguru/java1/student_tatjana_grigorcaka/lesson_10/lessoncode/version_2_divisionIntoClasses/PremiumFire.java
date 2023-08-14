package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_10.lessoncode.version_2_divisionIntoClasses;

import java.math.BigDecimal;
import java.util.List;

class PremiumFire {

/*
    private static final  BigDecimal DEFAULT_COEFFICIENT_FIRE = new BigDecimal("0.014");
    private static final  BigDecimal COEFFICIENT_FIRE = new BigDecimal("0.024");
    private static final  BigDecimal SUM_INSURED_FIRE_THRESHOLD = new BigDecimal("100");


    public static BigDecimal calculatePremiumFire(InsuredObject object) {
        BigDecimal sumInsuredFire = calculateSumInsuredFire(object);
        BigDecimal coefficientFire = selectCoefficientFire(sumInsuredFire);
        return sumInsuredFire.multiply(coefficientFire);
    }

    private static BigDecimal selectCoefficientFire(BigDecimal sumInsuredFire) {
        return sumInsuredFire.compareTo(SUM_INSURED_FIRE_THRESHOLD) > 0
                ? COEFFICIENT_FIRE
                : DEFAULT_COEFFICIENT_FIRE;
*/
/*
        BigDecimal coefficientFire = new BigDecimal("0.014");
        BigDecimal oneHundred = new BigDecimal ("100");
        if (sumInsuredFire.compareTo(oneHundred) > 0 ) {
            coefficientFire = new BigDecimal("0.024");
        }
        return coefficientFire;
 *//*

    }

    private static BigDecimal calculateSumInsuredFire(InsuredObject object) {
        BigDecimal sumInsuredFire = BigDecimal.ZERO;
        for (InsuredSubObject subObject : object.getSubObjects()) {
            List<RiskType> subObjectRisks = subObject.getRisks();
            if(subObjectRisks.contains(RiskType.FIRE)) {
                sumInsuredFire = sumInsuredFire.add(subObject.getSum());
            }
        }
        return sumInsuredFire;
    }
*/

}
