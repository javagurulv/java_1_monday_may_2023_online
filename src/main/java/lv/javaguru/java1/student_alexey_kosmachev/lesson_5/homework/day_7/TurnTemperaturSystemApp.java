package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.homework.day_7;

import java.util.Scanner;

class TurnTemperaturSystemApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your temperature in Celsius degree: ");
        int celsius = scanner.nextInt();
        System.out.println("Enter your temperature in Farengate degree: ");
        int farengate = scanner.nextInt();
        TurnTemperatureSystem conventor = new TurnTemperatureSystem();
        System.out.println("Degree in Farengate: " + conventor.degreeCelius(celsius));
        System.out.println("Degree in Celsius: " + conventor.degreeFarengate(farengate));
    }
}
