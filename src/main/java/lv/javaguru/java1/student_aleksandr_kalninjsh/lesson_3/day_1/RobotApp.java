package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_3.day_1;

public class RobotApp {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Elektronik");
        Robot robot2 = new Robot("Robokop");

        System.out.println(robot1.getName());
        System.out.println(robot2.getName());

        robot1.setName("Terminator");
        System.out.println(robot1.getName());
        robot2.setName("Sairex");
        System.out.println(robot2.getName());
    }
}
