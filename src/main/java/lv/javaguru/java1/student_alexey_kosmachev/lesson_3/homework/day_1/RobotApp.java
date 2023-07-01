package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_1;

import lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_1.Robot;

class RobotApp {
    public static void main(String[] args) {
        Robot Fedor = new Robot("Fedor"); //Задаем имя первому роботу
        Robot Peter = new Robot("Peter"); //Задаем имя второму роботу

        System.out.println("First Robot name: "); //Вывод первого имени робота
        System.out.println(Fedor.getName());

        Fedor.setName("Alex");
        System.out.println("First Robots name changed to: ");
        System.out.println(Fedor.getName());

        System.out.println("Second Robot Name: "); //Вывод второго имени робота
        System.out.println(Peter.getName());

        Peter.setName("Maria");
        System.out.println("Second Robots name changed to: ");
        System.out.println(Peter.getName());


    }
}
