package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.homework.day_7;

class BoomBoxApp {
    public static void main(String[] args) {
        BoomBox boomBox1 = new BoomBox("Marantz", 3, true);
        System.out.println(boomBox1.getModel() + " Volume level: " + boomBox1.getVolumeLevel() + " Position is: " + boomBox1.getSwitchOn());
        boomBox1.switchOn();
        System.out.println(boomBox1.getModel() + " Volume level: " + boomBox1.getVolumeLevel() + " Position is: " + boomBox1.getSwitchOn());
        boomBox1.increaseVolumeLevel();
        System.out.println(boomBox1.getModel() + " Volume level: " + boomBox1.getVolumeLevel() + " Position is: " + boomBox1.getSwitchOn());
        boomBox1.increaseVolumeLevel();
        System.out.println(boomBox1.getModel() + " Volume level: " + boomBox1.getVolumeLevel() + " Position is: " + boomBox1.getSwitchOn());
        boomBox1.increaseVolumeLevel();
        System.out.println(boomBox1.getModel() + " Volume level: " + boomBox1.getVolumeLevel() + " Position is: " + boomBox1.getSwitchOn());
        boomBox1.turnOff();
        System.out.println(boomBox1.getModel() + " Volume level: " + boomBox1.getVolumeLevel() + " Position is: " + boomBox1.getSwitchOn());
        boomBox1.increaseVolumeLevel();
        System.out.println(boomBox1.getModel() + " Volume level: " + boomBox1.getVolumeLevel() + " Position is: " + boomBox1.getSwitchOn());

    }
}
