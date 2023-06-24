package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day7;

public class dogDemo {
    public static void main(String[] args) {


        Dog bobik = new Dog("bobik", 4);
        Dog sharik = new Dog("Sharik", 8);
        bobik.voice();
        bobik.callAge();
        System.out.println("ooo... my birthday");
        bobik.birthDay();
        bobik.callAge();
    }
}