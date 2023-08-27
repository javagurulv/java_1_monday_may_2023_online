package lv.javaguru.java1.student_butrin_ilya.lesson_12.day1;

public class DefaultConstructorV3Demo {

    public static void main(String[] args) {
        DefaultConstructorV3 constructorV3 = new DefaultConstructorV3();
        int age = constructorV3.getAge();
        String fullname = constructorV3.getFullName();
        boolean male = constructorV3.isMale();
        Boolean female = constructorV3.getFemale();
        System.out.println(age);
        System.out.println(fullname);
        System.out.println(male);
        System.out.println(female);
    }

}
