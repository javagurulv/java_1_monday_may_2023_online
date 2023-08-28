package lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_7.task_2;

class Multiplication extends TwoArgumentMathOperation {

	public Multiplication(MathOperation leftArgument,
						  MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() * calculateRightSide();
	}
}
