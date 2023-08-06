package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_9;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class PremiumCalculatorTest {
    public static void main(String[] args) {

        PremiumCalculatorTest test = new PremiumCalculatorTest();
        test.testCalculatePremiumOneSubObjectOneObjectV1();
        test.testCalculatePremiumTwoSubObjectsOneObjectV2();
        test.testCalculatePremiumFourSubObjectsTwoObjectsV3();
    }

        public void testCalculatePremiumOneSubObjectOneObjectV1() {
        PremiumCalculator premiumCalculator = new PremiumCalculator();
            InsuredSubObject tv = new InsuredSubObject(
                    "TV",
                    new BigDecimal("1000.50"),
                    List.of(RiskType.FIRE)
            );

            List<InsuredSubObject> subObjects = new ArrayList();
            subObjects.add(tv);

            InsuredObject object1 = new InsuredObject(
                    "House1",
                    subObjects
            );

            List<InsuredObject> objects = new ArrayList();
            objects.add(object1);


            BigDecimal premium = premiumCalculator.calculate(new Policy("LV20-02-100000-5",
                    PolicyStatus.REGISTERED,
                    objects));
            checkResult(premium, new BigDecimal( "24.01200"),"testCalculatePremiumOneSubObjectOneObjectV1");
        }

    public void testCalculatePremiumTwoSubObjectsOneObjectV2() {
        PremiumCalculator premiumCalculator = new PremiumCalculator();
        InsuredSubObject tv = new InsuredSubObject(
                "TV",
                new BigDecimal("1000.50"),
                List.of(RiskType.FIRE)
        );

        InsuredSubObject fridge = new InsuredSubObject(
                "Fridge",
                new BigDecimal("500.00"),
                List.of(RiskType.FIRE, RiskType.THEFT)
        );

        List<InsuredSubObject> subObjects = new ArrayList();
        subObjects.add(tv);
        subObjects.add(fridge);

        InsuredObject object1 = new InsuredObject(
                "House1",
                subObjects
        );

        List<InsuredObject> objects = new ArrayList();
        objects.add(object1);


        BigDecimal premium = premiumCalculator.calculate(new Policy("LV20-02-100000-5",
                PolicyStatus.REGISTERED,
                objects));
        checkResult(premium, new BigDecimal( "61.01200"),"testCalculatePremiumTwoSubObjectsOneObjectV2");
    }

    public void testCalculatePremiumFourSubObjectsTwoObjectsV3() {
        PremiumCalculator premiumCalculator = new PremiumCalculator();
        InsuredSubObject tv = new InsuredSubObject(
                "TV",
                new BigDecimal("1000.50"),
                List.of(RiskType.FIRE)
        );

        InsuredSubObject fridge = new InsuredSubObject(
                "Fridge",
                new BigDecimal("500.00"),
                List.of(RiskType.FIRE, RiskType.THEFT)
        );

        List<InsuredSubObject> subObjects1 = new ArrayList();
        subObjects1.add(tv);
        subObjects1.add(fridge);

        InsuredSubObject computer = new InsuredSubObject(
                "Computer",
                new BigDecimal("2000.00"),
                List.of(RiskType.FIRE, RiskType.THEFT)
        );

        InsuredSubObject vacuumCleaner = new InsuredSubObject(
                "Vacuum Cleaner",
                new BigDecimal("700.00"),
                List.of(RiskType.FIRE)
        );

        List<InsuredSubObject> subObjects2 = new ArrayList();
        subObjects2.add(computer);
        subObjects2.add(vacuumCleaner);

        InsuredObject object1 = new InsuredObject(
                "House1",
                subObjects1
        );

        InsuredObject object2 = new InsuredObject(
                "House2",
                subObjects2
        );

        List<InsuredObject> objects = new ArrayList();
        objects.add(object1);
        objects.add(object2);


        BigDecimal premium = premiumCalculator.calculate(new Policy("LV20-02-100000-5",
                PolicyStatus.REGISTERED,
                objects));
        checkResult(premium, new BigDecimal( "225.81200"),"testCalculatePremiumFourSubObjectsTwoObjectsV3");
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

