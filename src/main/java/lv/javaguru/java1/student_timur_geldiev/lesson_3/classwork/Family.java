package lv.javaguru.java1.student_timur_geldiev.lesson_3.classwork;

public class Family {

    public static void main(String[] args) {
        Dad dadOne = new Dad("Dominic", "Toretto", 40);
        Mom momOne = new Mom("Letty", "Ortiz", 35);
        Kid kidOne = new Kid("Bobby", "Toretto", 8);
        Kid kidOneTwo = new Kid("Paul", "Walker", 20);

        Dad dadTwo = new Dad("John", "Smith", 35);
        Mom momTwo = new Mom("Jane", "Smith", 33);
        Kid kidTwo = new Kid("Richard", "Smith", 10);
        Kid kidTwoTwo = new Kid("Samantha", "Smith", 7);


        System.out.println("First family consists of: ");
        System.out.println(dadOne.firstName + " " + dadOne.lastName + " in age of " + dadOne.age);
        System.out.println(momOne.firstName + " " + momOne.lastName + " in age of " + momOne.age);
        System.out.println(kidOne.firstName + " " + kidOne.lastName + " in age of " + kidOne.age);
        System.out.println(kidOneTwo.firstName + " " + kidOneTwo.lastName + " in age of " + kidOneTwo.age);

        System.out.println("Second family consists of: ");
        System.out.println(dadTwo.firstName + " " + dadTwo.lastName + " in age of " + dadTwo.age);
        System.out.println(momTwo.firstName + " " + momTwo.lastName + " in age of " + momTwo.age);
        System.out.println(kidTwo.firstName + " " + kidTwo.lastName + " in age of " + kidTwo.age);
        System.out.println(kidTwoTwo.firstName + " " + kidTwoTwo.lastName + " in age of " + kidTwoTwo.age);
    }
}
