package lv.javaguru.java1.student_butrin_ilya.lesson_9.policy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
public class PremiumCalculator {
    private BigDecimal coefFireDeffolt = new BigDecimal( 0.014);
    private BigDecimal  coefFireMoreLimit = new BigDecimal( 0.024);
    private BigDecimal coefTheftDeffolt = new BigDecimal (0.11);
    private BigDecimal coefTheftMoreLimit = new BigDecimal( 0.05);
    private BigDecimal fireLimitDefoltPrice = new BigDecimal(100);
    private BigDecimal theftLimitDefoltPrice = new BigDecimal(15);


    public BigDecimal calculate(Policy policy) {
        PremiumCalculator colculate = new PremiumCalculator();
        List<Object> allhomes = colculate.allHomes(policy);
        BigDecimal fireSum  = colculate.calculateFare(allhomes);
        BigDecimal theftSum  = colculate.calculateThef(allhomes);
        System.out.println(fireSum.add(theftSum).setScale(2, RoundingMode.HALF_DOWN));
        return fireSum.add(theftSum).setScale(2, RoundingMode.HALF_DOWN);
    }

        private BigDecimal calculateFare( List<Object> allhomes) {
        BigDecimal finalSumma = BigDecimal.ZERO;
        PremiumCalculator colculate = new PremiumCalculator();

        for (int i = 0; i < allhomes.size(); i++) {
            Object home = allhomes.get(i);
            List<SubObject> allThingsFire = colculate.allThingsFire(home);
            BigDecimal sumFire = colculate.findSumFire(allThingsFire);
            BigDecimal coefficient = colculate.findFireCoefficient(sumFire);
            BigDecimal sum = sumFire.multiply(coefficient);
            finalSumma = sum.add(finalSumma);
        }
        return finalSumma;
        }

    private BigDecimal calculateThef( List<Object> allhomes) {
        BigDecimal finalSumma = BigDecimal.ZERO;
        PremiumCalculator colculate = new PremiumCalculator();
        for (int i = 0; i < allhomes.size(); i++) {
            Object home = allhomes.get(i);
            List<SubObject> allThingsThef = colculate.allThingsTheft(home);
            BigDecimal sumThef = colculate.findSumTheft(allThingsThef);
            BigDecimal coefficient = colculate.findTheftCoefficient(sumThef);
            BigDecimal sum = sumThef.multiply(coefficient);
            finalSumma = sum.add(finalSumma);
        }
        return finalSumma;
    }
    private List<Object> allHomes(Policy polisy) {
        List<Object> allhomes = new ArrayList<>();
        for (Object home : polisy.getObject()) {
            allhomes.add(home);
        }
        return allhomes;
    }
    private List<SubObject> allThingsFire(Object homeX) {
        List<SubObject> allThingsFire = new ArrayList<>();
        for (SubObject home : homeX.getSubObject()) {
            if (home.getRiskType().contains(RiskType.FIRE))
                allThingsFire.add(home);}
        return allThingsFire;
    }
    private List<SubObject> allThingsTheft(Object homeX) {
        List<SubObject> allThingsTheft = new ArrayList<>();
        for (SubObject home : homeX.getSubObject()) {
            if (home.getRiskType().contains(RiskType.THEFT))
                allThingsTheft.add(home);
        }
        return allThingsTheft;
    }
    private BigDecimal findSumFire(List<SubObject> allThingsFire) {
        BigDecimal sumFire = BigDecimal.ZERO;
        for (int i = 0; i < allThingsFire.size(); i++) {
            sumFire = sumFire.add(allThingsFire.get(i).getPrice());
        }
        return sumFire;
    }
    private BigDecimal findSumTheft(List<SubObject> allThingsTheft) {
        BigDecimal sumTheft = BigDecimal.ZERO;
        for (int i = 0; i < allThingsTheft.size(); i++) {
            sumTheft = sumTheft.add(allThingsTheft.get(i).getPrice());
        }
        return sumTheft;
    }
    private BigDecimal findFireCoefficient(BigDecimal sumFire) {
        BigDecimal fireCoefficient;
        if (sumFire.compareTo(fireLimitDefoltPrice) > 0) fireCoefficient = coefFireMoreLimit;
        else fireCoefficient = coefFireDeffolt;
        return fireCoefficient;
    }
    private BigDecimal findTheftCoefficient(BigDecimal sumTheft) {
        BigDecimal theftCoefficient;
        if (sumTheft.compareTo(theftLimitDefoltPrice) > 0) theftCoefficient = coefTheftMoreLimit;
        else theftCoefficient = coefTheftDeffolt;
        return theftCoefficient;
    }
}



