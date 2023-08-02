package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_6.day_5;

class ColorWaveDetectorTest {

    public static void main(String[] args) {

        ColorWaveDetectorTest colorWaveDetectorTest = new ColorWaveDetectorTest();
        colorWaveDetectorTest.violet();
        colorWaveDetectorTest.blue();
        colorWaveDetectorTest.green();
        colorWaveDetectorTest.yellow();
        colorWaveDetectorTest.orange();
        colorWaveDetectorTest.red();
        colorWaveDetectorTest.invisibleLight();




    }
        public void violet() {
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        int wave = 380;
        String expectedResult = ("Violet");
        String realResult = colorWaveDetector.colourWave(wave);
        if (realResult == expectedResult) {
            System.out.println("Violet test = OK");
        }
        else {
            System.out.println("Violet test = FAIL");
        }
    }
        public void blue() {
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        int wave = 450;
        String expectedResult = ("Blue");
        String realResult = colorWaveDetector.colourWave(wave);
        if (realResult == expectedResult) {
            System.out.println("Blue test = OK");
        }
        else {
            System.out.println("Blue test = FAIL");
        }
    }
        public void green() {
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        int wave = 495;
        String expectedResult = ("Green");
        String realResult = colorWaveDetector.colourWave(wave);
        if (realResult == expectedResult) {
            System.out.println("Green test = OK");
        }
        else {
            System.out.println("Green test = FAIL");
        }
    }
        public void yellow() {
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        int wave = 570;
        String expectedResult = ("Yellow");
        String realResult = colorWaveDetector.colourWave(wave);
        if (realResult == expectedResult) {
            System.out.println("Yellow test = OK");
        }
        else {
            System.out.println("Yellow test = FAIL");
        }
    }
        public void orange() {
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        int wave = 590;
        String expectedResult = ("Orange");
        String realResult = colorWaveDetector.colourWave(wave);
        if (realResult == expectedResult) {
            System.out.println("Orange test = OK");
        }
        else {
            System.out.println("Orange test = FAIL");
        }
    }
        public void red() {
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        int wave = 620;
        String expectedResult = ("Red");
        String realResult = colorWaveDetector.colourWave(wave);
        if (realResult == expectedResult) {
            System.out.println("Red test = OK");
        }
        else {
            System.out.println("Red test = FAIL");
        }
    }
        public void invisibleLight() {
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        int wave = 751;
        String expectedResult = ("Invisible Light");
        String realResult = colorWaveDetector.colourWave(wave);
        if (realResult == expectedResult) {
            System.out.println("Invisible light test = OK");
        }
        else {
            System.out.println("Invisible light test = FAIL");
        }
    }





}
