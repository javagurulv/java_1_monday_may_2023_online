package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_3.day_7;

public class MusicColumnDemo {

    public static void main(String[] args) {

        MusicColumn musicColumn = new MusicColumn("SONY", 10, true);
        System.out.println(musicColumn.getColumnModel());
        musicColumn.switchedOff();
        System.out.println(musicColumn.getSoundLevel());
        System.out.println(musicColumn.getSwitchedOn());
        System.out.println(musicColumn.getColumnModel());
        musicColumn.switchedOn();
        musicColumn.increaseVol();
        System.out.println(musicColumn.getSwitchedOn());
        System.out.println(musicColumn.getSoundLevel());
        System.out.println(musicColumn.getColumnModel());
        musicColumn.switchedOff();
        System.out.println(musicColumn.getSwitchedOn());
        System.out.println(musicColumn.getSoundLevel());















    }
}
