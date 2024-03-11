package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_7.Task_2;

class Number extends MathOperation {

    private double number;

    public Number (double number) {
        this.number = number;
    }
    @Override
    public double calculate() {
        return number;
    }


}
