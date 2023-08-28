package lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_7.task_2;

class Argument extends MathOperation {

	private double argument;

	public Argument(double argument) {
		this.argument = argument;
	}

	@Override
	public double calculate() {
		return argument;
	}
}
