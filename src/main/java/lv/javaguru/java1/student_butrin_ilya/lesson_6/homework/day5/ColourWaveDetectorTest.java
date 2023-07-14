package lv.javaguru.java1.student_butrin_ilya.lesson_6.homework.day5;

public class ColourWaveDetectorTest {
    ColourWaveDetector colourWaveDetector = new ColourWaveDetector();

    public static void main(String[] args) {
        ColourWaveDetectorTest test = new ColourWaveDetectorTest();
        test.violetTest();
        test.blueTest();
        test.greenTest();
        test.yellowTest();
        test.orangeTest();
        test.redTest();
        test.noColorTest();
    }

    public void violetTest() {
        String realRezultOne = "Violet";
        String realRezultTwo = "Violet";
        String realRezultThree = "Violet";
        String realRezultFor = "Violet";
        String realRezultFive = "Violet";
        String realRezultSix = "Violet";
        String realRezultSeven = "Violet";
        String expectedRezultOne = colourWaveDetector.colourWave(379);
        String expectedRezultTwo = colourWaveDetector.colourWave(380);
        String expectedRezultThree = colourWaveDetector.colourWave(381);
        String expectedRezultFor = colourWaveDetector.colourWave(400);
        String expectedRezultFive = colourWaveDetector.colourWave(448);
        String expectedRezultSix = colourWaveDetector.colourWave(449);
        String expectedRezultSeven = colourWaveDetector.colourWave(450);
        changeRezultFalse(realRezultOne, expectedRezultOne, "violeteTest 1 ");
        changeRezultTrue(realRezultTwo, expectedRezultTwo, "violeteTest 2 ");
        changeRezultTrue(realRezultThree, expectedRezultThree, "violeteTest 3 ");
        changeRezultTrue(realRezultFor, expectedRezultFor, "violeteTest 4 ");
        changeRezultTrue(realRezultFive, expectedRezultFive, "violeteTest 5 ");
        changeRezultTrue(realRezultSix, expectedRezultSix, "violeteTest 6 ");
        changeRezultFalse(realRezultSeven, expectedRezultSeven, "violeteTest 7 ");

    }

    public void blueTest() {
        String realRezult = "Blue";
        String expectedRezult = colourWaveDetector.colourWave(470);
        changeRezultTrue(realRezult, expectedRezult, "BlueTest");
    }

    public void greenTest() {
        String realRezult = "Green";
        String expectedRezult = colourWaveDetector.colourWave(500);
        changeRezultTrue(realRezult, expectedRezult, "GreenTest");
    }

    public void yellowTest() {
        String realRezult = "Yellow";
        String expectedRezult = colourWaveDetector.colourWave(580);
        changeRezultTrue(realRezult, expectedRezult, "YellowTest");
    }

    public void orangeTest() {
        String realRezult = "Orange";
        String expectedRezult = colourWaveDetector.colourWave(600);
        changeRezultTrue(realRezult, expectedRezult, "orangeTest");
    }

    public void redTest() {
        String realRezult = "Red";
        String expectedRezult = colourWaveDetector.colourWave(630);
        changeRezultTrue(realRezult, expectedRezult, "RedTest");
    }

    public void noColorTest() {
        String realRezult = "Invisible Light";
        String expectedRezult = colourWaveDetector.colourWave(800);
        changeRezultTrue(realRezult, expectedRezult, "noColorTest");
    }

    public void changeRezultTrue(String real, String expected, String name) {
        if (real.equals(expected)) {
            System.out.println("test" + name + "is OK");
        } else {
            System.out.println("test" + name + "is FAIL. Reason: realRezult " + real +
                    " is not equal expectedRezult " + expected);
        }
    }

    public void changeRezultFalse(String real, String expected, String name) {
        if (real.equals(expected)) {
            System.out.println("test" + name + "is FAIL. Reason: realRezult " + real +
                    " is equal expectedRezult " + expected);
        } else {
            System.out.println("test" + name + "is OK");
        }
    }
}

