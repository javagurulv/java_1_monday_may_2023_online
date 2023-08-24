package lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_3;

class Dog extends Animal{

    private String name;

    public Dog(String type, int legsAmount, String name) {
        super(type, legsAmount);
        this.name = name;
    }
}
