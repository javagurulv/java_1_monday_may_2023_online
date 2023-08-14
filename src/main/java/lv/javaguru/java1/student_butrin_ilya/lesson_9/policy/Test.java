package lv.javaguru.java1.student_butrin_ilya.lesson_9.policy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        PremiumCalculator colculate = new PremiumCalculator();

        SubObject tv = new SubObject("tv", new BigDecimal("10"), List.of(RiskType.FIRE));
        //SubObject freez = new SubObject("freez", new BigDecimal("1"), List.of(RiskType.THEFT));
       // SubObject audio = new SubObject("audio", new BigDecimal("101"), List.of(RiskType.FIRE));
       // SubObject foto = new SubObject("foto", new BigDecimal("7"), List.of(RiskType.THEFT,RiskType.FIRE));
        List<SubObject> home1SubObjekt = new ArrayList<>();
        Collections.addAll(home1SubObjekt, tv);
       // List<SubObject> home2SubObjekt = new ArrayList<>();
       // Collections.addAll(home2SubObjekt, foto);
        Object home1 = new Object("home1", home1SubObjekt);
       // Object home2 = new Object("home2", home2SubObjekt);
        List<Object> IlyaPolice = new ArrayList<>();
        Collections.addAll(IlyaPolice, home1);
        Policy policy = new Policy("lv2235", StatusPolicy.ACTIVE, IlyaPolice);
        colculate.calculate(policy);

    }
}
