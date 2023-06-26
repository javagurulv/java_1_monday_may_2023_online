package lv.javaguru.java1.student_butrin_ilya.lesson_3.classwork;

public class Person {
    String name;
    String secondName;
    int age;
    public Person (String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }
}
