package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_2.lessoncode;

import java.util.Scanner;
class TemperatureConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature value in Celsius: ");
        double celsius = input.nextDouble() ;

        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Celsius: " + celsius + " C");
        System.out.println("Fahrenheit: " + fahrenheit + " F");
        System.out.println("Kelvin: " + kelvin + " K");
    }

}

