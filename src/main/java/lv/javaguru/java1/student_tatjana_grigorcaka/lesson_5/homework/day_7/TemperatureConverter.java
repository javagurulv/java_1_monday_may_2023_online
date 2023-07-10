package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.homework.day_7;

//Celcius =  (°F) - 32) * 5/9
//Fahrenheit = (celcius * 9/5) + 32

class TemperatureConverter {

    public double convertCelciusToFahrenheit(double celcius) {
        return (celcius * 9/5) + 32;
    }
    public double convertFahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

}
