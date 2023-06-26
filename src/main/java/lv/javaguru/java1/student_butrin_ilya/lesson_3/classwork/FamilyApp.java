package lv.javaguru.java1.student_butrin_ilya.lesson_3.classwork;

public class FamilyApp {
    public static void main(String[] args) {
        Person fatherFamilyOne = new Person("ilya", "butrin", 32);
        Person motherFamilyOne = new Person("Daria", "butrina", 21);
        Person childrenFamilyOne = new Person("andrey", "butrinnn", 2);

        Person motherFamilyTwo = new Person("Siri", "Ivanova", 42);
        Person fatherFamilyTwo = new Person("Toomash", "Ivanov", 29);
        Person childrenFamilyTwo = new Person("Drey", "Ivanovvv", 4);

        Family Butrin = new Family(fatherFamilyOne, motherFamilyOne, childrenFamilyOne);
        Family ivanov = new Family(fatherFamilyTwo, motherFamilyTwo, childrenFamilyTwo);

        Family ivashko = new Family(fatherFamilyTwo, motherFamilyTwo);
    }
}
