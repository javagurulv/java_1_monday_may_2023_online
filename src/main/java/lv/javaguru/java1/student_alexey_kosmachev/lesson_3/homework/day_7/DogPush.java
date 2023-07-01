package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_7;

 class DogPush {
     public static void main(String[] args) {
         Dog mydog = new Dog("Shelby", 10);

         System.out.println("I am a dog.Let me represent myself: ");
         System.out.println("My nickname is " + mydog.getNickname());
         System.out.println("I am " + mydog.getPreviousAge() + " years old.");
         System.out.println("I have a birthsday. Today I am " + mydog.getAge());

     }
}
