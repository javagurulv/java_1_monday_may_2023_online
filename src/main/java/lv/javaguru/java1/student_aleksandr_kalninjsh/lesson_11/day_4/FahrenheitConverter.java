package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_11.day_4;

public class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature +32;
    }
}
