package lv.javaguru.java1.student_timur_geldiev.lesson_3.homework.day7;

class Speaker {

    String model;
    int volumeLvl;
    boolean isOn;

    public Speaker(String model, int volumeLvl, boolean isOn){
        this.model = model;
        this.volumeLvl = 0;
        this.isOn = false;
    }
    public void turnOn(){
        this.isOn = true;
    }
    public void increaseVol(){
        if(isOn == true && volumeLvl < 10) {
            volumeLvl += 1;
        } else System.out.println("The speaker is turned off.");
    }
    public void decreaseVol(){
        if(isOn == true && volumeLvl < 10 && volumeLvl > 0) {
            volumeLvl -= 1;
            if(volumeLvl <= 0){
                isOn = false;
            }
        } else System.out.println("The speaker is turned off.");
    }
    public void turnOff(){
        this.isOn = false;
        this.volumeLvl = 0;
    }

    public int getVolumeLvl() {
        return volumeLvl;
    }

    public String getModel() {
        return model;
    }

    public boolean getIsOn() {
        return isOn;
    }
}
