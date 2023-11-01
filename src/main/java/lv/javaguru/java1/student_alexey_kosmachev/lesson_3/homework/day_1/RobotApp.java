package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_1;


class RobotApp {
    public static void main(String[] args) {
        Robot fedor = new Robot("Fedor"); //Задаем имя первому роботу
        Robot peter = new Robot("Peter"); //Задаем имя второму роботу

        System.out.println("First Robot name: " + fedor.getName()); //Вывод первого имени робота

        fedor.setName("Alex");
        System.out.println("First Robots name changed to: " + fedor.getName()); //Изменение имени

        System.out.println("Second Robot Name: " + peter.getName()); //Вывод второго имени робота

        peter.setName("Maria");
        System.out.println("Second Robots name changed to: " + peter.getName()); //Изменение имени

    }
}
