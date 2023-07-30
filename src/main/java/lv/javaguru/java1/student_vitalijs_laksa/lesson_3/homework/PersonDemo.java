package lv.javaguru.java1.student_vitalijs_laksa.lesson_3.homework;

public class PersonDemo {
    //lesson from Konstantin video.

    public static void main(String[] args) {

        Person vitalijs = new Person();
        vitalijs.age = 38;
        vitalijs.name = "Vitalijs Laksa";

        Person olga = new Person();
        olga.age = 36;
        olga.name = "Olga Jefremova";

        Person milana = new Person();
        milana.age = 15;
        milana.name = "Milana Jefremova";

        Person victoria = new Person();
        victoria.age = 12;
        victoria.name = "Victoria Laksa";

        System.out.println(vitalijs.name + " is " + vitalijs.age + " years old");
        System.out.println(olga.name + " is " + olga.age + " years old");
        System.out.println(milana.name + " is " + milana.age + " years old");
        System.out.println(victoria.name + " is " + victoria.age + " years old");

    }
}
