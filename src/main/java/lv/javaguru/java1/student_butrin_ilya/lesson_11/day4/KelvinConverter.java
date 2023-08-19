package lv.javaguru.java1.student_butrin_ilya.lesson_11.day4;
class KelvinConverter implements TemperatureConverter {
        @Override
        public double convert(double celsiusTemperature) {
            return celsiusTemperature + 273.15;

    }
}

