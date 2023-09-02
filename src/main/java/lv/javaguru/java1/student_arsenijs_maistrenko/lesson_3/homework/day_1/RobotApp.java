package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_3.homework.day_1;

public class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("robo1");
        Robot robot2 = new Robot("robo2");

        System.out.println(robot1.getName());
        System.out.println(robot2.getName());

        robot1.setName("New robo1");
        robot2.setName("New robo2");
        System.out.println(robot1.getName());
        System.out.println(robot2.getName());
    }
}