package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_10.lessoncode.version_2_showClientPremiumParts;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PremiumCalculatorApp {

    public static void main(String[] args) {
        PremiumCalculator premiumCalculator = new PremiumCalculator();
        InsuredSubObject tv = new InsuredSubObject("TV", new BigDecimal("99.50"), List.of(RiskType.FIRE));
        InsuredSubObject fridge = new InsuredSubObject("Fridge", new BigDecimal("100.50"), List.of(RiskType.THEFT));
        List<InsuredSubObject> subObjects = new ArrayList();
        subObjects.add(tv);
        subObjects.add(fridge);
        InsuredObject object1 = new InsuredObject("House1", subObjects);
        List<InsuredObject> objects = new ArrayList();
        objects.add(object1);
        BigDecimal premium = premiumCalculator.calculate(new Policy("LV20-02-100000-5", PolicyStatus.REGISTERED, objects));
    }

}
