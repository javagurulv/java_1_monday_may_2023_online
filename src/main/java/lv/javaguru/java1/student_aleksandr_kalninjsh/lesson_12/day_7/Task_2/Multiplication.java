package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_7.Task_2;

class Multiplication extends TwoNumbersMathOperation {

    public Multiplication (MathOperation leftNumber,
                           MathOperation rightNumber) {
        super(leftNumber, rightNumber);

    }
    @Override
    public double calculate() {
        return (10 - 5) * (20 / 5);
    }
}
