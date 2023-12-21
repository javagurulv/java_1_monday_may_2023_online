package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_11.day_4;

public class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature +273.15;
    }

}
