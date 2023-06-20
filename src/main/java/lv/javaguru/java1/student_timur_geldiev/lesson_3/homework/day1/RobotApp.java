package lv.javaguru.java1.student_timur_geldiev.lesson_3.homework.day1;

public class RobotApp {

    public static void main(String[] args) {
        Robot T800 = new Robot();
        T800.name = "Arnold";
        T800.setName("Petja");
        System.out.println(T800.getName());

        Robot T1000 = new Robot();
        T1000.name = "Robert";
        T1000.setName("Aljosha");
        System.out.println(T1000.getName());
    }
}
