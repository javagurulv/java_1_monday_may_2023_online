package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day_7;

public class TemperatureConverterApp {
    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        System.out.println(temperatureConverter.ConvertFromCelsToFar(30));
        System.out.println(temperatureConverter.ConvertFromCelsToFar(50));
        System.out.println(temperatureConverter.ConvertFromFarToCels(86));
        System.out.println(temperatureConverter.ConvertFromFarToCels(245));
    }
}
