package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.homework.day_1;

public class RobotApp {

    public static void main(String[] args) {
        Robot alphaRobot = new Robot("Alpha");
        Robot jarvisRobot = new Robot("Jarvis");

        System.out.println("Robot name is:");
        System.out.println(alphaRobot.getName());
        alphaRobot.setName("Ug");

        System.out.println("Robot name is:");
        System.out.println(jarvisRobot.getName());
        jarvisRobot.setName("Jet");
    }

    }

