package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_3.day_7;

public class MusicColumn {

    String columnModel;
    int soundLevel;
    boolean switchedOn;

    public MusicColumn(String columnModel, int soundLevel, boolean switchedOn) {
        this.columnModel = columnModel;
        this.soundLevel = soundLevel = 0;
        this.switchedOn = switchedOn = false;
    }

    public String getColumnModel() {
        return columnModel;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public boolean getSwitchedOn() {
        return switchedOn;
    }

    public void switchedOn() {
        this.switchedOn = true;
        System.out.println("Music column is On");
    }

    public void switchedOff() {
        this.switchedOn = false;
        this.soundLevel = 0;
        System.out.println("Music column is Off");
    }

    public void increaseVol() {
        if (switchedOn = true && soundLevel < 10) {
            this.soundLevel = soundLevel + 1;
            System.out.println("Max sound level");
        }



    }
}