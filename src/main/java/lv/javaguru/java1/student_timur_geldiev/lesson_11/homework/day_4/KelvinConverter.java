package lv.javaguru.java1.student_timur_geldiev.lesson_11.homework.day_4;

public class KelvinConverter implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
