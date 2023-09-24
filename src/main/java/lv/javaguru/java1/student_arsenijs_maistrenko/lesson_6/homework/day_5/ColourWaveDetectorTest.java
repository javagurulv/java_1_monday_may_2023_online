package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_6.homework.day_5;

public class ColourWaveDetectorTest {
    public static void main(String[] args) {
        ColourWaveDetectorTest test = new ColourWaveDetectorTest();
        test.test0();
        test.test1();
        test.test2();
        test.test3();
        test.test5();
        test.test6();
        test.test7();

    }
    public void test0() {
        ColourWaveDetector wave0 = new ColourWaveDetector();
        String result = wave0.colourWave(0);
        checkResult(result, "Invisible Light", "test0");
    }
    public void test1() {
        ColourWaveDetector wave1 = new ColourWaveDetector();
        String result = wave1.colourWave(400);
        checkResult(result, "Violet", "test1");
    }
    public void test2() {
        ColourWaveDetector wave2 = new ColourWaveDetector();
        String result = wave2.colourWave(450);
        checkResult(result, "Blue", "test2");
    }
    public void test3() {
        ColourWaveDetector wave3 = new ColourWaveDetector();
        String result = wave3.colourWave(500);
        checkResult(result, "Green", "test3");
    }
    public void test4() {
        ColourWaveDetector wave4 = new ColourWaveDetector();
        String result = wave4.colourWave(570);
        checkResult(result, "Yellow", "test4");
    }
    public void test5() {
        ColourWaveDetector wave5 = new ColourWaveDetector();
        String result = wave5.colourWave(600);
        checkResult(result, "Orange", "test5");
    }
    public void test6() {
        ColourWaveDetector wave6 = new ColourWaveDetector();
        String result = wave6.colourWave(700);
        checkResult(result, "Red", "test6");
    }
    public void test7() {
        ColourWaveDetector wave7 = new ColourWaveDetector();
        String result = wave7.colourWave(1000);
        checkResult(result, "Invisible Light", "test7");
    }
    private void checkResult(String realResult,
                             String expectedResult,
                             String testScenarioName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testScenarioName + ": PASS");
        } else {
            System.out.println(testScenarioName + ": FAIL");
        }
    }
}