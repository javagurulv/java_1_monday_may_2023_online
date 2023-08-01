package lv.javaguru.java1.student_timur_geldiev.lesson_9.classwork;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PolicyCreatorExample {

    public static void main(String[] args) {
        InsuredSubObject tv = new InsuredSubObject("TV", new BigDecimal("1000.50"), List.of(RiskType.FIRE));
        InsuredSubObject fridge = new InsuredSubObject("FRIDGE", new BigDecimal("500.00"), List.of(RiskType.FIRE, RiskType.THEFT));

        InsuredSubObject vacuumCleaner = new InsuredSubObject("Vacuum cleaner", new BigDecimal("300"), List.of(RiskType.FIRE, RiskType.THEFT));
        InsuredSubObject washingMachine = new InsuredSubObject("Washing Machine", new BigDecimal("850.99"), List.of(RiskType.FIRE));
        InsuredSubObject tv1 = new InsuredSubObject("TV", new BigDecimal("1500"), List.of(RiskType.FIRE, RiskType.THEFT));
        InsuredSubObject tv2 = new InsuredSubObject("TV", new BigDecimal("250"), List.of(RiskType.FIRE, RiskType.THEFT));

        List<InsuredSubObject> subObjects1 = new ArrayList<>();
        subObjects1.add(tv);
        subObjects1.add(fridge);

        List<InsuredSubObject> subObjects2 = new ArrayList<>();
        subObjects2.add(vacuumCleaner);
        subObjects2.add(washingMachine);
        subObjects2.add(tv1);
        subObjects2.add(tv2);

        InsuredObject object1 = new InsuredObject("House 1", subObjects1);
        InsuredObject object2 = new InsuredObject("House 2", subObjects2);
        List<InsuredObject> objects = new ArrayList<>();
        objects.add(object1);
        objects.add(object2);

        Policy policy = new Policy("LV-1", PolicyStatus.REGISTERED, objects);

//        PremiumCalculator calc = new PremiumCalculator();
//        BigDecimal test = calc.calculate(policy);
//        System.out.println(test);

    }
}
