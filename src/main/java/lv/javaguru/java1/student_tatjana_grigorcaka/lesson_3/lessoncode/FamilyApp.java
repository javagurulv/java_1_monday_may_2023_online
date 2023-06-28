package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.lessoncode;

public class FamilyApp {
    public static void main(String[] args) {

        Mother motherOne = new Mother("Anna", "Muller", 30);
        Father fatherOne = new Father("Sebastian", "Muller", 37);
        Child childOne = new Child("Emily", "Muller", 4);
        Child childOneTwo = new Child("Christoph", "Muller", 2);


        Mother motherTwo = new Mother("Sara ", "Kelly", 40);
        Father fatherTwo = new Father("Johnathan", "Kelly", 45);
        Child childTwoOne = new Child("Andy", "Kelly", 10);
        Child childTwoTwo = new Child("Catherine", "Kelly", 7);

        System.out.println("Family 1: ");
        System.out.println(fatherOne.firstName);
        System.out.println(fatherOne.lastName);
        System.out.println(fatherOne.age);
        System.out.println(motherOne.firstName);
        System.out.println(motherOne.lastName);
        System.out.println(motherOne.age);
        System.out.println(childOne.firstName);
        System.out.println(childOne.lastName);
        System.out.println(childOne.age);
        System.out.println(childOneTwo.firstName);
        System.out.println(childOneTwo.lastName);
        System.out.println(childOneTwo.age);

        System.out.println("Family 2: ");
        System.out.println(fatherTwo.firstName);
        System.out.println(fatherTwo.lastName);
        System.out.println(fatherTwo.age);
        System.out.println(motherTwo.firstName);
        System.out.println(motherTwo.lastName);
        System.out.println(motherTwo.age);
        System.out.println(childTwoOne.firstName);
        System.out.println(childTwoOne.lastName);
        System.out.println(childTwoOne.age);
        System.out.println(childTwoTwo.firstName);
        System.out.println(childTwoTwo.lastName);
        System.out.println(childTwoTwo.age);
    }

}
