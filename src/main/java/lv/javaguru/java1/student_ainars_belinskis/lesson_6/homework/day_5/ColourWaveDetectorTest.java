package lv.javaguru.java1.student_ainars_belinskis.lesson_6.homework.day_5;

class ColourWaveDetectorTest {
    public static void main(String[] args) {
        ColourWaveDetectorTest test = new ColourWaveDetectorTest();
        test.testWaveMin1();
        test.testWave0();
        test.testWave379();
        test.testWave380();
        test.testWave449();
        test.testWave450();
        test.testWave495();
        test.testWave570();
        test.testWave590();
        test.testWave620();
        test.testWave751();



    }

    public void testWaveMin1(){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int wave = -1;
        String result = colourWaveDetector.colourWave(wave);
        checkResult(result, "Invisible Light","testWaveMin1");
    }
    public void testWave0(){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int wave = 0;
        String result = colourWaveDetector.colourWave(wave);
        checkResult(result, "Invisible Light","testWave0");
    }
    public void testWave379(){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int wave = 379;
        String result = colourWaveDetector.colourWave(wave);
        checkResult(result, "Invisible Light","testWave379");
    }
    public void testWave380(){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int wave = 380;
        String result = colourWaveDetector.colourWave(wave);
        checkResult(result, "Violet","testWave380");
    }
    public void testWave449(){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int wave = 449;
        String result = colourWaveDetector.colourWave(wave);
        checkResult(result, "Violet","testWave449");
    }
    public void testWave450(){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int wave = 450;
        String result = colourWaveDetector.colourWave(wave);
        checkResult(result, "Blue","testWave450");
    }
    public void testWave495(){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int wave = 495;
        String result = colourWaveDetector.colourWave(wave);
        checkResult(result, "Green","testWave495");
    }
    public void testWave570(){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int wave = 570;
        String result = colourWaveDetector.colourWave(wave);
        checkResult(result, "Yellow","testWave570");
    }
    public void testWave590(){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int wave = 590;
        String result = colourWaveDetector.colourWave(wave);
        checkResult(result, "Orange","testWave590");
    }
    public void testWave620(){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int wave = 620;
        String result = colourWaveDetector.colourWave(wave);
        checkResult(result, "Red","testWave620");
    }
    public void testWave751(){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int wave = 751;
        String result = colourWaveDetector.colourWave(wave);
        checkResult(result, "Invisible Light","testWave751");
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
