package lv.javaguru.java1.student_timur_geldiev.lesson_11.homework.day_3;

@FunctionalInterface
interface FunctionalInterfaceExampleInterface {
    void doSomething();
    default void doSomethingElse(){
        System.out.println("Do something else...");
    }
}
