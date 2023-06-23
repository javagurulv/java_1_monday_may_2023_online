package lv.javaguru.java1.student_ainars_belinskis.lesson_3.homework.day_1;

class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("DRR2");
        Robot robot2 = new Robot("Alex");

        System.out.println("Robot name is:");
        System.out.println(robot1.getRobotName());

        System.out.println("Robot name is:");
        System.out.println(robot2.getRobotName());

        robot1.setRobotName("New DDR3");
        System.out.println(robot1.getRobotName());

        robot2.setRobotName("New Alex2");
        System.out.println(robot2.getRobotName());
    }
}
