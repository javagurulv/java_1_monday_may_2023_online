package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_7.Task_2;

class Division extends TwoNumbersMathOperation {

    public Division (MathOperation leftNumber,
                     MathOperation rightNumber) {
        super(leftNumber, rightNumber);


    }
    @Override
    public double calculate() {
        return 20 / 5;
    }
}
