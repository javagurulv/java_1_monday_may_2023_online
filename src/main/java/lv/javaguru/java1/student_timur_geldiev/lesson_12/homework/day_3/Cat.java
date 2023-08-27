package lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_3;

class Cat extends Animal{

    private boolean isFur;

    public Cat(String type, int legsAmount, boolean isFur) {
        super(type, legsAmount);
        this.isFur = isFur;
    }
}
