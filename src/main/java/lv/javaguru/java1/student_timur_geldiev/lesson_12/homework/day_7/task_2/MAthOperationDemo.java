package lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_7.task_2;

class MAthOperationDemo {

	public static void main(String[] args) {
		// build and calculate: 10 + 20
		Argument arg1 = new Argument(10);
		Argument arg2 = new Argument(20);
		MathOperation addition = new Addition(arg1, arg2);
		System.out.println("Left side Addition result = " + addition.calculate());

		// build and calculate: 50 - 20
		Argument arg3 = new Argument(50);
		Argument arg4 = new Argument(20);
		MathOperation subtraction = new Subtraction(arg3, arg4);
		System.out.println("Right side Subtraction result = " + addition.calculate());

		// build and calculate: (10 + 20) + (50 - 20)
		MathOperation addition1 = new Addition(addition, subtraction);
		System.out.println("Final Addition result = " + addition1.calculate());

		// build and calculate: (10 - 5) * (20 / 5)
		Argument arg5 = new Argument(5);
		MathOperation subtraction2 = new Subtraction(arg1, arg5);
		System.out.println("Left side Subtraction result = " + subtraction2.calculate());
		MathOperation division = new Division(arg2, arg5);
		System.out.println("Right side division = " + division.calculate());
		MathOperation multiplication = new Multiplication(subtraction2, division);
		System.out.println("Final result = " + multiplication.calculate());
	}

}