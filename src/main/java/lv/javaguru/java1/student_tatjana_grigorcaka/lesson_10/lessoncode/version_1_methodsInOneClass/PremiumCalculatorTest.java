package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_10.lessoncode.version_1_methodsInOneClass;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class PremiumCalculatorTest {
    public static void main(String[] args) {

        PremiumCalculatorTest test = new PremiumCalculatorTest();
        test.testCalculatePremiumOneObjectOneSubObjectFireSumInsuredUnder100();
        test.testCalculatePremiumOneObjectOneSubObjectFireSumInsured100();
        test.testCalculatePremiumOneObjectOneSubObjectFireSumInsuredOver100();
        test.testCalculatePremiumOneObjectTwoSubObjectsFireSumInsuredOver100();
        test.testCalculatePremiumOneObjectOneSubObjectTheftSumInsuredUnder15();
        test.testCalculatePremiumOneObjectOneSubObjectTheftSumInsured15();
        test.testCalculatePremiumOneObjectOneSubObjectTheftSumInsuredOver15();
        test.testCalculatePremiumOneObjectTwoSubObjectsTheftSumInsuredOver15();
        test.testCalculatePremiumTwoObjectsTwoSubObjectsFireTheft();
    }

    public void testCalculatePremiumOneObjectOneSubObjectFireSumInsuredUnder100() {
        PremiumCalculator premiumCalculator = new PremiumCalculator();
        InsuredSubObject tv = new InsuredSubObject("TV", new BigDecimal("99.50"), List.of(RiskType.FIRE));
        List<InsuredSubObject> subObjects = new ArrayList();
        subObjects.add(tv);

        InsuredObject object1 = new InsuredObject("House1", subObjects);
        List<InsuredObject> objects = new ArrayList();
        objects.add(object1);

        BigDecimal premium = premiumCalculator.calculate(new Policy("LV20-02-100000-5", PolicyStatus.REGISTERED, objects));
        checkResult(premium, new BigDecimal( "1.39"),"testCalculatePremiumOneObjectOneSubObjectFireSumInjuredUnder100");
        }

    public void testCalculatePremiumOneObjectOneSubObjectFireSumInsured100() {
        PremiumCalculator premiumCalculator = new PremiumCalculator();
        InsuredSubObject tv = new InsuredSubObject("TV", new BigDecimal("100.00"), List.of(RiskType.FIRE));
        List<InsuredSubObject> subObjects = new ArrayList();
        subObjects.add(tv);

        InsuredObject object1 = new InsuredObject("House1", subObjects);
        List<InsuredObject> objects = new ArrayList();
        objects.add(object1);

        BigDecimal premium = premiumCalculator.calculate(new Policy("LV20-02-100000-5", PolicyStatus.REGISTERED, objects));
        checkResult(premium, new BigDecimal( "1.40"),"testCalculatePremiumOneObjectOneSubObjectFireSumInjured100");
    }

    public void testCalculatePremiumOneObjectOneSubObjectFireSumInsuredOver100() {
        PremiumCalculator premiumCalculator = new PremiumCalculator();
       InsuredSubObject tv = new InsuredSubObject("TV", new BigDecimal("1000.50"), List.of(RiskType.FIRE));
        List<InsuredSubObject> subObjects = new ArrayList();
        subObjects.add(tv);

       InsuredObject object1 = new InsuredObject("House1", subObjects);
        List<InsuredObject> objects = new ArrayList();
        objects.add(object1);

        BigDecimal premium = premiumCalculator.calculate(new Policy("LV20-02-100000-5",PolicyStatus.REGISTERED, objects));
        checkResult(premium, new BigDecimal( "24.01"),"testCalculatePremiumOneObjectOneSubObjectFireSumInjuredOver100");
    }

    public void testCalculatePremiumOneObjectTwoSubObjectsFireSumInsuredOver100() {
        PremiumCalculator premiumCalculator = new PremiumCalculator();
        InsuredSubObject tv = new InsuredSubObject("TV", new BigDecimal("1000.50"), List.of(RiskType.FIRE));
        InsuredSubObject fridge = new InsuredSubObject("Fridge", new BigDecimal("500.00"), List.of(RiskType.FIRE));
        List<InsuredSubObject> subObjects = new ArrayList();
        subObjects.add(tv);
        subObjects.add(fridge);

        InsuredObject object1 = new InsuredObject("House1", subObjects);
        List<InsuredObject> objects = new ArrayList();
        objects.add(object1);

        BigDecimal premium = premiumCalculator.calculate(new Policy("LV20-02-100000-5", PolicyStatus.REGISTERED, objects));
        checkResult(premium, new BigDecimal( "36.01"),"testCalculatePremiumOneObjectTwoSubObjectsFireSumInjuredOver100");
    }


    public void testCalculatePremiumOneObjectOneSubObjectTheftSumInsuredUnder15() {
       PremiumCalculator premiumCalculator = new PremiumCalculator();
        InsuredSubObject wallClock = new InsuredSubObject("Wall Clock", new BigDecimal("8.00"), List.of(RiskType.THEFT));
        List<InsuredSubObject> subObjects = new ArrayList();
        subObjects.add(wallClock);

        InsuredObject object1 = new InsuredObject("House1", subObjects);
        List<InsuredObject> objects = new ArrayList();
        objects.add(object1);


        BigDecimal premium = premiumCalculator.calculate(new Policy("LV20-02-100000-5", PolicyStatus.REGISTERED, objects));
        checkResult(premium, new BigDecimal( "0.88"),"testCalculatePremiumOneObjectOneSubObjectTheftSumInjuredUnder15");
    }

    public void testCalculatePremiumOneObjectOneSubObjectTheftSumInsured15() {
        PremiumCalculator premiumCalculator = new PremiumCalculator();
        InsuredSubObject wallClock = new InsuredSubObject("Wall Clock", new BigDecimal("15.00"), List.of(RiskType.THEFT));
        List<InsuredSubObject> subObjects = new ArrayList();
        subObjects.add(wallClock);

        InsuredObject object1 = new InsuredObject("House1", subObjects);
        List<InsuredObject> objects = new ArrayList();
        objects.add(object1);


        BigDecimal premium = premiumCalculator.calculate(new Policy("LV20-02-100000-5", PolicyStatus.REGISTERED, objects));
        checkResult(premium, new BigDecimal( "0.75"),"testCalculatePremiumOneObjectOneSubObjectTheftSumInjured15");
    }

    public void testCalculatePremiumOneObjectOneSubObjectTheftSumInsuredOver15() {
        PremiumCalculator premiumCalculator = new PremiumCalculator();
        InsuredSubObject blender = new InsuredSubObject("Blender", new BigDecimal("50.51"), List.of(RiskType.THEFT));
        List<InsuredSubObject> subObjects = new ArrayList();
        subObjects.add(blender);

        InsuredObject object1 = new InsuredObject("House1", subObjects);
        List<InsuredObject> objects = new ArrayList();
        objects.add(object1);

        BigDecimal premium = premiumCalculator.calculate(new Policy("LV20-02-100000-5", PolicyStatus.REGISTERED, objects));
        checkResult(premium, new BigDecimal( "2.53"),"testCalculatePremiumOneObjectOneSubObjectTheftSumInjuredOver15");
    }

    public void testCalculatePremiumOneObjectTwoSubObjectsTheftSumInsuredOver15() {
        PremiumCalculator premiumCalculator = new PremiumCalculator();
        InsuredSubObject wallClock = new InsuredSubObject("Wall Clock", new BigDecimal("35.00"), List.of(RiskType.THEFT));
        InsuredSubObject blender = new InsuredSubObject("Blender", new BigDecimal("50.51"), List.of(RiskType.THEFT));
        List<InsuredSubObject> subObjects = new ArrayList();
        subObjects.add(wallClock);
        subObjects.add(blender);

        InsuredObject object1 = new InsuredObject("House1", subObjects);
        List<InsuredObject> objects = new ArrayList();
        objects.add(object1);

        BigDecimal premium = premiumCalculator.calculate(new Policy("LV20-02-100000-5", PolicyStatus.REGISTERED, objects));
        checkResult(premium, new BigDecimal( "4.28"),"testCalculatePremiumOneObjectTwoSubObjectsTheftSumInjuredOver15");
    }

    public void testCalculatePremiumTwoObjectsTwoSubObjectsFireTheft() {
        PremiumCalculator premiumCalculator = new PremiumCalculator();
        InsuredSubObject tv = new InsuredSubObject("TV", new BigDecimal("1000.50"), List.of(RiskType.FIRE));
        List<InsuredSubObject> subObjects1 = new ArrayList();
        subObjects1.add(tv);
        InsuredSubObject computer = new InsuredSubObject("Computer", new BigDecimal("2000.00"), List.of(RiskType.THEFT));
        List<InsuredSubObject> subObjects2 = new ArrayList();
        subObjects2.add(computer);

        InsuredObject object1 = new InsuredObject("House1", subObjects1);
        InsuredObject object2 = new InsuredObject("House2", subObjects2);

        List<InsuredObject> objects = new ArrayList();
        objects.add(object1);
        objects.add(object2);

        BigDecimal premium = premiumCalculator.calculate(new Policy("LV20-02-100000-5", PolicyStatus.REGISTERED, objects));
        checkResult(premium, new BigDecimal( "124.01"),"testCalculatePremiumTwoObjectsTwoSubObjectsFireTheft");
    }



    private void checkResult (BigDecimal realResult,
                                  BigDecimal expectedResult,
        String testScenarioName) {
            if (realResult.equals(expectedResult)) {
                System.out.println(testScenarioName + ": TEST OK!");
            } else {
                System.out.println(testScenarioName + ": TEST FAIL!");
            }
        }
    }

