package lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_1;

class DefaultConstructorV3Demo {

    public static void main(String[] args) {

        DefaultConstructorV3 demo = new DefaultConstructorV3();
        demo.setFullName("John Smith");
        demo.setAge(25);
        demo.setMale(true);
        demo.setFemale(null);
        System.out.println(demo.getFullName());
        System.out.println(demo.getAge());
        System.out.println(demo.isMale());
        System.out.println(demo.getFemale());
    }
}
