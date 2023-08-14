package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_10.lessoncode.version_2_divisionIntoClasses;

import java.math.BigDecimal;
import java.util.List;

class PremiumTheft {

/*
    private static final BigDecimal DEFAULT_COEFFICIENT_THEFT = new BigDecimal("0.11");
    private static final  BigDecimal COEFFICIENT_THEFT = new BigDecimal("0.05");
    private static final  BigDecimal SUM_INSURED_THEFT_THRESHOLD = new BigDecimal("15");


    public static BigDecimal calculatePremiumTheft(InsuredObject object) {
        BigDecimal premiumTheft = BigDecimal.ZERO;
        BigDecimal sumInsuredTheft = calculateSumInsuredTheft(object);
        BigDecimal coefficientTheft = selectCoefficientTheft(sumInsuredTheft);
        return premiumTheft = sumInsuredTheft.multiply(coefficientTheft);
    }

    private static BigDecimal selectCoefficientTheft(BigDecimal sumInsuredTheft) {
        return sumInsuredTheft.compareTo(SUM_INSURED_THEFT_THRESHOLD) >= 0
                ? COEFFICIENT_THEFT
                : DEFAULT_COEFFICIENT_THEFT;
*/
/*
        BigDecimal coefficientTheft = DEFAULT_COEFFICIENT_THEFT;
        if (sumInsuredTheft.compareTo(SUM_INSURED_THEFT_THRESHOLD) >= 0 ) {
            coefficientTheft = COEFFICIENT_THEFT;
        }
        return coefficientTheft;
 *//*

    }

    private static BigDecimal calculateSumInsuredTheft(InsuredObject object) {
        BigDecimal sumInsuredTheft = BigDecimal.ZERO;
        for (InsuredSubObject subObject : object.getSubObjects()) {
            List<RiskType> subObjectRisks = subObject.getRisks();
            if(subObjectRisks.contains(RiskType.THEFT)) {
                sumInsuredTheft = sumInsuredTheft.add(subObject.getSum());
            }
        }
        return sumInsuredTheft;
    }
*/
}
