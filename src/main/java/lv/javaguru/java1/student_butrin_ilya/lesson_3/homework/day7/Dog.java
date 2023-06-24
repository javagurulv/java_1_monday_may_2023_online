package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day7;

public class Dog {
    private String dogName;
    private int age;
    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }
    public void voice () {
        System.out.println("My name is " + dogName);
    }
    public void birthDay () {
        this.age = age + 1;
    }
    public void callAge () {
        System.out.println("I am " + age + "years old");
    }


}
