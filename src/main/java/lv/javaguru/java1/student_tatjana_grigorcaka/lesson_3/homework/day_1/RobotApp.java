package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.homework.day_1;

class RobotApp {

    public static void main(String[] args) {
        Robot robotOne = new Robot("Alpha-1");
        Robot robotTwo = new Robot("Jarvis-1");

        System.out.println("Robot 1 name is:");
        System.out.println(robotOne.getName());

        robotOne.setName("Alpha-2");
        System.out.println(robotOne.getName());

        System.out.println("Robot 2 name is:");
        System.out.println(robotTwo.getName());

        robotTwo.setName("Jarvis-2");
        System.out.println(robotTwo.getName());

    }

    }

