package lv.javaguru.java1.student_ainars_belinskis.lesson_5.homework;

public class ColourWaveApp {
    public static void main(String[] args) {
        ColourWaveDetector colorWave1 = new ColourWaveDetector();
        System.out.println("Colour: " + colorWave1.colourWave(345));
        System.out.println("Colour: " + colorWave1.colourWave(400));
        System.out.println("Colour: " + colorWave1.colourWave(470));
        System.out.println("Colour: " + colorWave1.colourWave(550));
        System.out.println("Colour: " + colorWave1.colourWave(580));
        System.out.println("Colour: " + colorWave1.colourWave(600));
        System.out.println("Colour: " + colorWave1.colourWave(700));
        System.out.println("Colour: " + colorWave1.colourWave(800));
    }
}
