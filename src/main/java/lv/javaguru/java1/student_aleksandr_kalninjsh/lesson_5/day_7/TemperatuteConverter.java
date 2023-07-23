package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_5.day_7;

class TemperatuteConverter {

    public double celsiusConverter (double tc) {
        double tf = (9 / 5 * tc) + 32;
        return tf;
    }
    public double fahrenheitConverter (double tf) {
        double tc = (tf - 32) * 5 / 9;
        return tc;
    }

}
