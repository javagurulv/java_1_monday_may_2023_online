package lv.javaguru.java1.teacher.lesson_10_junit.lessoncode;

public class TaxCalculatorImpl implements TaxCalculator {

	@Override
	public double calculate(double income) {
		return income * 0.25;
	}

}
