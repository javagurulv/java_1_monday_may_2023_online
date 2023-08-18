package lv.javaguru.java1.student_timur_geldiev.lesson_9.classwork;

import lv.javaguru.java1.teacher.lesson_11_interfaces.lessoncode.Policy;

import java.math.BigDecimal;

public interface PremiumCalculator {

    BigDecimal calculate(Policy policy);

}
