package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_7.Task_2;

class MathOperationDemo {

    public static void main(String[] args) {
        Number number1 = new Number(10);
        Number number2 = new Number(5);
        MathOperation subtraction = new Subtraction(number1, number2);
        System.out.println("Left side subtraction result: " + subtraction.calculate());

        Number number3 = new Number(20);
        Number number4 = new Number(5);
        MathOperation division = new Division(number3, number4);
        System.out.println("Right side division result: " + division.calculate());

        MathOperation multiplication = new Multiplication(subtraction, division);
        System.out.println("Multiplication result: " + multiplication.calculate());
    }

}
