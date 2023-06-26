package lv.javaguru.java1.student_ainars_belinskis.lesson_3.homework.day_7;

public class SpeakerApp {
    public static void main(String[] args) {
        Speaker speak1 = new Speaker("SONY", 2, true);

        System.out.println(speak1.model + " Sound level = " + speak1.soundLevel + " Switch position is: " + speak1.switchOn);
        speak1.speakerON();
        System.out.println(speak1.getModel() + " Sound level = " + speak1.getSoundLevel()+ " Switch position is: " + speak1.getSwitchOn());
        speak1.increaseSound();
        System.out.println(speak1.getModel() + " Sound level = " + speak1.getSoundLevel()+ " Switch position is: " + speak1.getSwitchOn());
        speak1.speakerOFF();
        System.out.println(speak1.getModel() + " Sound level = " + speak1.getSoundLevel()+ " Switch position is: " + speak1.getSwitchOn());
        speak1.increaseSound();
        System.out.println(speak1.getModel() + " Sound level = " + speak1.getSoundLevel()+ " Switch position is: " + speak1.getSwitchOn());
        speak1.speakerON();
        speak1.increaseSound();
        System.out.println(speak1.getModel() + " Sound level = " + speak1.getSoundLevel()+ " Switch position is: " + speak1.getSwitchOn());
        speak1.increaseSound();
        speak1.increaseSound();
        speak1.increaseSound();
        speak1.increaseSound();
        speak1.increaseSound();
        System.out.println(speak1.getModel() + " Sound level = " + speak1.getSoundLevel()+ " Switch position is: " + speak1.getSwitchOn());
        speak1.increaseSound();
        speak1.increaseSound();
        speak1.increaseSound();
        speak1.increaseSound();
        speak1.speakerOFF();
        speak1.increaseSound();
        System.out.println(speak1.getModel() + " Sound level = " + speak1.getSoundLevel()+ " Switch position is: " + speak1.getSwitchOn());

    }
}
