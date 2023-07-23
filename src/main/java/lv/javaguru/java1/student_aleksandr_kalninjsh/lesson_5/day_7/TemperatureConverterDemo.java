package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_5.day_7;

import java.util.Scanner;

class TemperatureConverterDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter celsius temperature: ");
        double tc = scanner.nextDouble();
        System.out.println("Enter fahrenheit temperature: ");
        double tf = scanner.nextDouble();
        TemperatuteConverter temperatuteConverter = new TemperatuteConverter();
        System.out.println("TF: " + temperatuteConverter.celsiusConverter(tc));
        System.out.println("TC: " + temperatuteConverter.fahrenheitConverter(tf));


    }
}
