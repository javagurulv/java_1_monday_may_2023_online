package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.homework.day_1;

public class RobotApp {

    public static void main(String[] args) {
        Robot robotOne = new Robot("Alpha-1");
        Robot robotTwo = new Robot("Jarvis-1");

        robotOne.setName("Alpha-2");
        System.out.println(robotOne.getName());

        robotTwo.setName("Jarvis-2");
        System.out.println(robotTwo.getName());

    }

    }

