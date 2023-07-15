package lv.javaguru.java1.student_alexey_kosmachev.lesson_6.homework.day_5;

public class ColourWaveDetectorTest {
    // int 400 result violet
    // int 470 result blue
    // int 500 result green
    // int 575 result yellow
    // int 600 result orange
    // int 650 result red
    // int 800 result invisible light

    public static void main(String[] args) {

        ColourWaveDetectorTest waveDetecor = new ColourWaveDetectorTest();
        waveDetecor.test1();
        waveDetecor.test2();
        waveDetecor.test3();
        waveDetecor.test4();
        waveDetecor.test5();
        waveDetecor.test6();
        waveDetecor.test7();

    }

    public void test1 () {
        ColourWaveDetector wave1 = new ColourWaveDetector();
        String result = wave1.colourWave(400);
        checkResult(result, "Violet", "The wave is Violet:");
    }
    public void test2 () {
        ColourWaveDetector wave2 = new ColourWaveDetector();
        String result = wave2.colourWave(470);
        checkResult(result, "Blue", "The wave is Blue:");
    }
    public void test3 () {
        ColourWaveDetector wave3 = new ColourWaveDetector();
        String result = wave3.colourWave(500);
        checkResult(result, "Green", "The wave is Green:");
    }
    public void test4 () {
        ColourWaveDetector wave4 = new ColourWaveDetector();
        String result = wave4.colourWave(575);
        checkResult(result, "Yellow", "The wave is Yellow:");
    }
    public void test5 () {
        ColourWaveDetector wave5 = new ColourWaveDetector();
        String result = wave5.colourWave(600);
        checkResult(result, "Orange", "The wave is Orange:");
    }
    public void test6 () {
        ColourWaveDetector wave6 = new ColourWaveDetector();
        String result = wave6.colourWave(650);
        checkResult(result, "Red", "The wave is Red:");
    }
    public void test7 () {
        ColourWaveDetector wave7 = new ColourWaveDetector();
        String result = wave7.colourWave(800);
        checkResult(result, "Invisible Light", "The wave is Invisible Light:");
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
