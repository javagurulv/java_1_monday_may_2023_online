package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day7;

public class MusicBoxDemo {
    public static void main(String[] args) {
        MusicBox music1 = new MusicBox("Samsung g32");
        music1.on();
        System.out.println(music1.getIson());
        music1.moreSound();
        music1.moreSound();
        System.out.println(music1.getVolume());
        music1.off();
        System.out.println(music1.getVolume());
        System.out.println(music1.getIson());
    }
}
