package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_1;

public class DefaultConstructorV3Demo {

    public static void main(String[] args) {
        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3();
        defaultConstructorV3.setFullName("Maikl");
        defaultConstructorV3.setAge(27);
        defaultConstructorV3.setMale(true);
        defaultConstructorV3.setFemale(false);

        System.out.println(defaultConstructorV3.getFullName());
        System.out.println(defaultConstructorV3.getAge());
        System.out.println(defaultConstructorV3.isMale());
        System.out.println(defaultConstructorV3.isFemale());



    }
}
