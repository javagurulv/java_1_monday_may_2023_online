package lv.javaguru.java1.student_timur_geldiev.lesson_3.homework.day7;

class SpeakerDemo {
    public static void main(String[] args) {
        Speaker speaker1 = new Speaker("JBL");
        System.out.println(speaker1.getModel() + " is ON : " + speaker1.getIsOn() + " and the current volume lvl is " + speaker1.getVolumeLvl());
        speaker1.increaseVol();
        speaker1.turnOn();
        System.out.println(speaker1.getModel() + " is ON : " + speaker1.getIsOn() + " and the current volume lvl is " + speaker1.getVolumeLvl());
        speaker1.increaseVol();
        speaker1.increaseVol();
        System.out.println(speaker1.getModel() + " is ON : " + speaker1.getIsOn() + " and the current volume lvl is " + speaker1.getVolumeLvl());
        speaker1.decreaseVol();
        speaker1.decreaseVol();
        speaker1.decreaseVol();
        speaker1.decreaseVol();
        System.out.println(speaker1.getModel() + " is ON : " + speaker1.getIsOn() + " and the current volume lvl is " + speaker1.getVolumeLvl());
        speaker1.turnOff();
        System.out.println(speaker1.getModel() + " is ON : " + speaker1.getIsOn() + " and the current volume lvl is " + speaker1.getVolumeLvl());

    }
}
