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
    // Test data 15: num1 = 10; expected result = Invisible Light
    // Test data 16: num1 = 5; expected result = XXX
    // Test data 17: num1 = -1; expected result = YYY

    public static void main(String[] args) {
        ColourWaveDetectorTest test = new ColourWaveDetectorTest();
        test.testColourWaveDetectorVioletV1();
        test.testColourWaveDetectorVioletV2();
        test.testColourWaveDetectorBlueV1();
        test.testColourWaveDetectorBlueV2();
        test.testColourWaveDetectorGreenV1();
        test.testColourWaveDetectorGreenV2();
        test.testColourWaveDetectorYellowV1();
        test.testColourWaveDetectorYellowV2();
        test.testColourWaveDetectorOrangeV1();
        test.testColourWaveDetectorOrangeV2();
        test.testColourWaveDetectorRedV1();
        test.testColourWaveDetectorRedV2();
        test.testColourWaveDetectorInvisibleLightV1();
        test.testColourWaveDetectorInvisibleLightV2();
        test.testColourWaveDetectorInvisibleLightV3();
        test.testColourWaveDetectorV1();
        test.testColourWaveDetectorV2();
    }
    public void testColourWaveDetectorVioletV1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(380);
        checkResult(result, "Violet", "testColourWaveDetectorVioletV1");
    }

    public void testColourWaveDetectorVioletV2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(449);
        checkResult(result, "Violet", "testColourWaveDetectorVioletV2");
    }

    public void testColourWaveDetectorBlueV1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(450);
        checkResult(result, "Blue", "testColourWaveDetectorBlueV1");
    }

    public void testColourWaveDetectorBlueV2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(494);
        checkResult(result, "Blue", "testColourWaveDetectorBlueV2");
    }

    public void testColourWaveDetectorGreenV1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(495);
        checkResult(result, "Green", "testColourWaveDetectorGreenV1");
    }
    public void testColourWaveDetectorGreenV2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(569);
        checkResult(result, "Green", "testColourWaveDetectorGreenV2");
    }

    public void testColourWaveDetectorYellowV1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(570);
        checkResult(result, "Yellow", "testColourWaveDetectorYellowV1");
    }
    public void testColourWaveDetectorYellowV2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(589);
        checkResult(result, "Yellow", "testColourWaveDetectorYellowV2");
    }

    public void testColourWaveDetectorOrangeV1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(590);
        checkResult(result, "Orange", "testColourWaveDetectorOrangeV1");
    }

    public void testColourWaveDetectorOrangeV2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(619);
        checkResult(result, "Orange", "testColourWaveDetectorOrangeV2");
    }

    public void testColourWaveDetectorRedV1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(620);
        checkResult(result, "Red", "testColourWaveDetectorRedV1");
    }

    public void testColourWaveDetectorRedV2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(750);
        checkResult(result, "Red", "testColourWaveDetectorRedV2");
    }

    public void testColourWaveDetectorInvisibleLightV1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(379);
        checkResult(result, "Invisible Light", "testColourWaveDetectorInvisibleLightV1");
    }

    public void testColourWaveDetectorInvisibleLightV2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(751);
        checkResult(result, "Invisible Light", "testColourWaveDetectorInvisibleLightV2");
    }
    public void testColourWaveDetectorInvisibleLightV3() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(10);
        checkResult(result, "Invisible Light", "testColourWaveDetectorInvisibleLightV3");
    }

    public void testColourWaveDetectorV1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(5);
        checkResult(result, "XXX", "testColourWaveDetectorV1");
    }

    public void testColourWaveDetectorV2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(-1);
        checkResult(result, "YYY", "testColourWaveDetectorV2");
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
