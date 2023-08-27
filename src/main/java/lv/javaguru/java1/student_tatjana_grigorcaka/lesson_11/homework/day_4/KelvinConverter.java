package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_4;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
