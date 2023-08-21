package lv.javaguru.java1.student_timur_geldiev.lesson_11.homework.day_3;

public class FunctionalInterfaceExample {

    FunctionalInterfaceExampleInterface example = new FunctionalInterfaceExampleInterface() {
        @Override
        public void doSomething() {
            System.out.println("Doing something...");
        }
    };
}
