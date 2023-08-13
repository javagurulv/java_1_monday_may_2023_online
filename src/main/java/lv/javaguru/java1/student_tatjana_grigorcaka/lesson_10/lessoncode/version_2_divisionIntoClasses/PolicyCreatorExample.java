package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_10.lessoncode.version_2_divisionIntoClasses;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class PolicyCreatorExample {

    public static void main(String[] args) {
        InsuredSubObject tv = new InsuredSubObject("TV", new BigDecimal("100.00"), List.of(RiskType.FIRE));
        InsuredSubObject fridge = new InsuredSubObject("FRIDGE", new BigDecimal("500.00"), List.of(RiskType.THEFT));
        List<InsuredSubObject> subObjects1= new ArrayList();
        subObjects1.add(tv);
        subObjects1.add(fridge);

        InsuredObject house1 = new InsuredObject("House1", subObjects1);
        List<InsuredObject> objects = new ArrayList();
        objects.add(house1);

        Policy policy1 = new Policy("LV20-02-100000-5", PolicyStatus.REGISTERED, objects);

    }
}
