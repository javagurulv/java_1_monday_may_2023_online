package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_4;

public class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
