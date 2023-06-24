package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day1;

class RobotApp {

    public static void main(String[] args) {
        Robot rob1 = new Robot("Mers");
        Robot rob2 = new Robot("Mers2");
       // String robName1 = rob1.getName();
       // String robName2 = rob2.getName();

System.out.println(rob1.robotName);
rob1.setName("NEW_Mers");
System.out.println(rob2.robotName);
rob2.setName("NEW_Mers2");
System.out.println(rob1.robotName);
System.out.println(rob2.robotName);

    }
}
