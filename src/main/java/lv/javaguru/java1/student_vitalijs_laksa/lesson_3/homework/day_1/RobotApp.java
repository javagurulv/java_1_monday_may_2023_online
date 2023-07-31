package lv.javaguru.java1.student_vitalijs_laksa.lesson_3.homework.day_1;

public class RobotApp {
    public static void main(String[] args) {
        Robot x1 = new Robot("Terminator");
        Robot x2 = new Robot("Robocop");

        System.out.println("Robot name is " + (x1.getRobotName() ));

        System.out.println("Robot name is " + (x2.getRobotName()));

        x1.setRobotName("T-34");
        System.out.println("New Robot name is " + x1.getRobotName());

        x2.setRobotName("IronMent");
        System.out.println("New Robot name is " + x2.getRobotName());
    }
}

