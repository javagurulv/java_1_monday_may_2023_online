package lv.javaguru.java1.teacher.lesson_11_interfaces.lessoncode.v3;

import lv.javaguru.java1.teacher.lesson_11_interfaces.lessoncode.InsuredObject;

import java.math.BigDecimal;

public interface RiskPremiumCalculator {

    BigDecimal calculatePremium(InsuredObject object);

}
