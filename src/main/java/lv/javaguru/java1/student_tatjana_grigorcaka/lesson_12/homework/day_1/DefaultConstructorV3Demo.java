package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_12.homework.day_1;

class DefaultConstructorV3Demo {

    public static void main(String[] args) {

        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3();
        defaultConstructorV3.setFullName("Emily");
        defaultConstructorV3.setAge(5);
        defaultConstructorV3.setFemale(true);
        defaultConstructorV3.setMale(false);

        System.out.println(defaultConstructorV3.getFullName());
        System.out.println(defaultConstructorV3.getAge());
        System.out.println(defaultConstructorV3.isFemale());
        System.out.println(defaultConstructorV3.isMale());

    }
}
