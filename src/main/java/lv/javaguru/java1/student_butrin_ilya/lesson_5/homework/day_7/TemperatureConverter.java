package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day_7;

public class TemperatureConverter {

    public float ConvertFromCelsToFar (float cels) {
        float far = cels * 9 / 5 + 32;
        return far;
    }
    public float ConvertFromFarToCels(float far) {
        float cels = (far - 32) * 5 / 9;
        return cels;
    }
}
