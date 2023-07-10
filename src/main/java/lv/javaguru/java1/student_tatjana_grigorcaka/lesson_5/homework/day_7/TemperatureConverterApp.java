package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.homework.day_7;

import java.util.Scanner;


class TemperatureConverterApp {
    public static void main(String[] args) {
        TemperatureConverter celsiusToFahrenheit = new TemperatureConverter();
        System.out.println("Temperature in Fahrenheit is: " + " F " + celsiusToFahrenheit.convertCelciusToFahrenheit(30));
        System.out.println("Temperature in Celcius is: " + " C " + celsiusToFahrenheit.convertFahrenheitToCelcius(70));
    }
}
