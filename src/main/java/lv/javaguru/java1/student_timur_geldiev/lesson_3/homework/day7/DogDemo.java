package lv.javaguru.java1.student_timur_geldiev.lesson_3.homework.day7;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tuzik", 5);
        dog1.celebration();
        dog1.celebration();
        dog1.celebration();
        System.out.println(dog1.voice());
        System.out.println(dog1.getAge());
    }
}
