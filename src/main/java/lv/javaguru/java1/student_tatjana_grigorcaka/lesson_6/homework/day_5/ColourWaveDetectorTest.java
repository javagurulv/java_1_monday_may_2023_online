package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_5;

class ColourWaveDetectorTest {
    // Test data 1: num1 = 380; expected result = Violet
    // Test data 2: num1 = 449; expected result = Violet
    // Test data 3: num1 = 450; expected result = Blue
    // Test data 4: num1 = 494; expected result = Blue
    // Test data 5: num1 = 495; expected result = Green
    // Test data 6: num1 = 569; expected result = Green
    // Test data 7: num1 = 570; expected result = Yellow
    // Test data 8: num1 = 589; expected result = Yellow
    // Test data 9: num1 = 590; expected result = Orange
    // Test data 10: num1 = 619; expected result = Orange
    // Test data 11: num1 = 620; expected result = Red
    // Test data 12: num1 = 750 expected result = Red
    // Test data 13: num1 = 379; expected result = Invisible Light
    // Test data 14: num1 = 751; expected result = Invisible Light

    public static void main(String[] args) {
        ColourWaveDetectorTest test = new ColourWaveDetectorTest();
        test.testColourWaveDetectorViolet1();
        test.testColourWaveDetectorViolet2();
        test.testColourWaveDetectorBlue3();
        test.testColourWaveDetectorBlue4();
        test.testColourWaveDetectorGreen5();
        test.testColourWaveDetectorGreen6();
        test.testColourWaveDetectorYellow7();
        test.testColourWaveDetectorYellow8();
        test.testColourWaveDetectorOrange9();
        test.testColourWaveDetectorOrange10();
        test.testColourWaveDetectorRed11();
        test.testColourWaveDetectorRed12();
        test.testColourWaveDetectorInvisibleLight13();
        test.testColourWaveDetectorInvisibleLight14();
    }
    public void testColourWaveDetectorViolet1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(380);
        checkResult(result, "Violet", "testColourWaveDetectorViolet1");
    }

    public void testColourWaveDetectorViolet2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(449);
        checkResult(result, "Violet", "testColourWaveDetectorViolet2");
    }

    public void testColourWaveDetectorBlue3() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(450);
        checkResult(result, "Blue", "testColourWaveDetectorBlue3");
    }

    public void testColourWaveDetectorBlue4() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(494);
        checkResult(result, "Blue", "testColourWaveDetectorBlue4");
    }

    public void testColourWaveDetectorGreen5() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(495);
        checkResult(result, "Green", "testColourWaveDetectorGreen5");
    }
    public void testColourWaveDetectorGreen6() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(569);
        checkResult(result, "Green", "testColourWaveDetectorGreen6");
    }

    public void testColourWaveDetectorYellow7() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(570);
        checkResult(result, "Yellow", "testColourWaveDetectorYellow7");
    }
    public void testColourWaveDetectorYellow8() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(589);
        checkResult(result, "Yellow", "testColourWaveDetectorYellow8");
    }

    public void testColourWaveDetectorOrange9() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(590);
        checkResult(result, "Orange", "testColourWaveDetectorOrange9");
    }

    public void testColourWaveDetectorOrange10() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(619);
        checkResult(result, "Orange", "testColourWaveDetectorOrange10");
    }

    public void testColourWaveDetectorRed11() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(620);
        checkResult(result, "Red", "testColourWaveDetectorRed11");
    }

    public void testColourWaveDetectorRed12() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(750);
        checkResult(result, "Red", "testColourWaveDetectorRed12");
    }

    public void testColourWaveDetectorInvisibleLight13() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(379);
        checkResult(result, "Invisible Light", "testColourWaveDetectorInvisibleLight13");
    }

    public void testColourWaveDetectorInvisibleLight14() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(751);
        checkResult(result, "Invisible Light", "testColourWaveDetectorInvisibleLight14");
    }

    private void checkResult(String realResult,
                             String expectedResult,
                             String testScenarioName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}
