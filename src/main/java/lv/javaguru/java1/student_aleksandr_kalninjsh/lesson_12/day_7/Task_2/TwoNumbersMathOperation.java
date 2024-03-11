package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_7.Task_2;

abstract class TwoNumbersMathOperation extends MathOperation {

    private MathOperation leftNumber;
    private MathOperation rightNumber;


    public TwoNumbersMathOperation (MathOperation leftNumber,
                             MathOperation rightNumber) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
    }

    public double calculateLeftSide() {
        return leftNumber.calculate();
    }
    public double calculateRightSide() {
        return rightNumber.calculate();
    }


}
