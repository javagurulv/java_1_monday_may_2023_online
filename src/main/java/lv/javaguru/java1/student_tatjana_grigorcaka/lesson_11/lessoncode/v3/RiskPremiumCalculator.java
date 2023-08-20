package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.lessoncode.v3;

import lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.lessoncode.InsuredObject;


import java.math.BigDecimal;

public interface RiskPremiumCalculator {

    BigDecimal calculatePremium (InsuredObject object);

}
