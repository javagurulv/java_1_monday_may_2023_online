package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_12.homework.day_1;


class DefaultConstructorDemo {

    public static void main(String[] args) {

        DefaultConstructor defaultConstructor = new DefaultConstructor("Emily");
        defaultConstructor.name = "Emily";
        defaultConstructor.age = 5;
        System.out.println(defaultConstructor.name);
        System.out.println(defaultConstructor.age);
    }
}

