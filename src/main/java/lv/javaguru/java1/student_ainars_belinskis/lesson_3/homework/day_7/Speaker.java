package lv.javaguru.java1.student_ainars_belinskis.lesson_3.homework.day_7;

class Speaker {
    String model;
    int soundLevel;
    boolean switchOn;

    public Speaker(String model) {
        this.model = model;
        this.soundLevel = 0;
        this.switchOn = false;
    }

    public Speaker(String model,
                   int soundLevel,
                   boolean switchOn) {
        this.model = model;
        this.soundLevel = soundLevel;
        this.switchOn = switchOn;
    }


    public String getModel() { return model; }

    public int getSoundLevel() { return soundLevel; }

    public boolean getSwitchOn() { return switchOn; }


   public void speakerON(){ this.switchOn = true;}
   public void speakerOFF(){ this.soundLevel = 0; this.switchOn = false;}
    public void increaseSound() {
        if (switchOn == false) {
            System.out.println("The switch is OFF.");
        }

        if (switchOn == true && soundLevel < 10) {
            soundLevel = soundLevel + 1;
        }
        if (switchOn == true && soundLevel == 10) {
            System.out.println("Speaker has maximum volume!!!");
        }

    }
    public int returnSound(){ return soundLevel;}

}
