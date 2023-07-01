package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_1;


class RobotApp {
    public static void main(String[] args) {
        Robot fedor = new Robot("Fedor"); //Задаем имя первому роботу
        Robot peter = new Robot("Peter"); //Задаем имя второму роботу

        System.out.println("First Robot name: "); //Вывод первого имени робота
        System.out.println(fedor.getName());

        fedor.setName("Alex");
        System.out.println("First Robots name changed to: ");
        System.out.println(fedor.getName());

        System.out.println("Second Robot Name: "); //Вывод второго имени робота
        System.out.println(peter.getName());

        peter.setName("Maria");
        System.out.println("Second Robots name changed to: ");
        System.out.println(peter.getName());


    }
}
