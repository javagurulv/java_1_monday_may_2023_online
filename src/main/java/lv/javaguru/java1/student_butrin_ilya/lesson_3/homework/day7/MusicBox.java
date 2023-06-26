package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day7;

public class MusicBox {
    private String type;
    private int volume;
    boolean isOn;
    public MusicBox (String type){
        this.type = type;
        this.volume = 0;
        this.isOn = false;
    }

    public void on (){
        this.isOn = true;
        System.out.println("Music box ON");
    }
    public void off (){
        this.isOn = false;
        this.volume = 0;
        System.out.println("Music box OFF");
    }
    public void moreSound () {
        if (isOn = true & volume < 10) {
            this.volume = volume + 1;
            System.out.println("volume = " + volume);
        } else if (volume >= 10) {
            System.out.println("volume level is MAX");
        } else {
            System.out.println("Music box is OFF");
        }
    }
        public String getType() {
                return type;
        }
        public int getVolume() {
            return volume;
        }
        public boolean getIson() {
            return isOn;
        }
    }

