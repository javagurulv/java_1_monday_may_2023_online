package lv.javaguru.java1.student_timur_geldiev.lesson_6.homework.day_5;

public class ColourWaveDetectorTest {
    public static void main(String[] args) {
        ColourWaveDetectorTest test = new ColourWaveDetectorTest();
        test.checkViolet();
        test.checkBlue();
        test.checkGreen();
        test.checkYellow();
        test.checkOrange();
        test.checkRed();
        test.checkInvisibilityHigh();
        test.checkInvisibilityLow();
    }

    public void checkViolet() {
        int wave = 400;
        ColourWaveDetector test1 = new ColourWaveDetector();
        String actual = test1.colourWave(wave);
        checkResult(actual, "Violet", "Check violet");
    }

    public void checkBlue() {
        int wave = 450;
        ColourWaveDetector test2 = new ColourWaveDetector();
        String actual = test2.colourWave(wave);
        checkResult(actual, "Blue", "Check blue");

    }

    public void checkGreen() {
        int wave = 496;
        ColourWaveDetector test3 = new ColourWaveDetector();
        String actual = test3.colourWave(wave);
        checkResult(actual, "Green", "Check green");

    }

    public void checkYellow() {
        int wave = 589;
        ColourWaveDetector test4 = new ColourWaveDetector();
        String actual = test4.colourWave(wave);
        checkResult(actual, "Yellow", "Check yellow");

    }

    public void checkOrange() {
        int wave = 600;
        ColourWaveDetector test5 = new ColourWaveDetector();
        String actual = test5.colourWave(wave);
        checkResult(actual, "Orange", "Check orange");

    }

    public void checkRed() {
        int wave = 620;
        ColourWaveDetector test6 = new ColourWaveDetector();
        String actual = test6.colourWave(wave);
        checkResult(actual, "Red", "Check red");

    }

    public void checkInvisibilityHigh() {
        int wave = 1000;
        ColourWaveDetector test7 = new ColourWaveDetector();
        String actual = test7.colourWave(wave);
        checkResult(actual, "Invisible Light", "Check invisible Light high");

    }

    public void checkInvisibilityLow() {
        int wave = 1;
        ColourWaveDetector test8 = new ColourWaveDetector();
        String actual = test8.colourWave(wave);
        checkResult(actual, "Invisible Light", "Check invisible Light low");
    }

    public void checkResult(String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " Test PASS");
        } else {
            System.out.println(testName + " Test FAIL");
        }
    }
}
