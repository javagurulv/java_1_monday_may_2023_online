package lv.javaguru.java1.student_butrin_ilya.lesson_11.day4;

public class FeringeitConverter implements TemperatureConverter{

  @Override
  public double convert(double celsiosTemperature) {

            return celsiosTemperature * 1.8 + 32;
        }
    }
