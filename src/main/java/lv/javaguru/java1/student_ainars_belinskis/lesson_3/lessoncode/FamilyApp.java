package lv.javaguru.java1.student_ainars_belinskis.lesson_3.lessoncode;

public class FamilyApp {
    public static void main(String[] args) {
        Person fatheOneFamily = new Person("Aleks", "Denisov", 45);
        Person matherOneFamily = new Person("Marija", "Denisova", 37);
        Person childeOneFamilyOne = new Person("Robert", "Denisov", 17);
        Person childeTwoFamilyOne = new Person("Svetlana", "Denisova", 13);

        Person fatheTwoFamily = new Person("John", "Wick", 41);
        Person motherTwoFamily = new Person("Lara", "Wick", 40);
        Person childeOneFamilyTwo = new Person("Boby", "Wick", 15);
        Person childeTwoFamilyTwo = new Person("Stefan", "Wick", 12);

        Family familyOne = new Family("Family One", fatheOneFamily,matherOneFamily, childeOneFamilyOne, childeTwoFamilyOne);
        Family familyTwo = new Family("Family Two", fatheTwoFamily, motherTwoFamily, childeOneFamilyTwo, childeTwoFamilyTwo);


        System.out.println(familyOne.familyNumber);
        System.out.println(familyOne.father.name);
        System.out.println(familyOne.father.surname);
        System.out.println(familyOne.father.age);
        System.out.println(familyOne.mother.name);
        System.out.println(familyOne.mother.surname);
        System.out.println(familyOne.mother.age);
        System.out.println(familyOne.childeOne.name);
        System.out.println(familyOne.childeOne.surname);
        System.out.println(familyOne.childeOne.age);
        System.out.println(familyOne.childeTwo.name);
        System.out.println(familyOne.childeTwo.surname);
        System.out.println(familyOne.childeTwo.age);

        System.out.println(familyTwo.familyNumber);
        System.out.println(familyTwo.father.name);
        System.out.println(familyTwo.father.surname);
        System.out.println(familyTwo.father.age);
        System.out.println(familyTwo.mother.name);
        System.out.println(familyTwo.mother.surname);
        System.out.println(familyTwo.mother.age);
        System.out.println(familyTwo.childeOne.name);
        System.out.println(familyTwo.childeOne.surname);
        System.out.println(familyTwo.childeOne.age);
        System.out.println(familyTwo.childeTwo.name);
        System.out.println(familyTwo.childeTwo.surname);
        System.out.println(familyTwo.childeTwo.age);



    }
}
