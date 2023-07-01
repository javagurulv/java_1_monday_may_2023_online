package lv.javaguru.java1.student_alexey_kosmachev.lesson_2.workinclass;

class SummaChiselFloat {
    public static void main(String[]args) {
        //float - маленькие вещественные числа
        //double - большие вещественные числа

        float number1 = 1.5F;
        float number2 = 3.2F;

        float sumResult = number1 + number2;
        float reduceResult = number1 - number2;
        float multiplyResult = number1 * number2;
        float divisionResult = number1 / number2;

        System.out.println("Sum result = " + sumResult);
        System.out.println("Reduce result = " + reduceResult);
        System.out.println("Multiply result = " + multiplyResult);
        System.out.println("Division result = " + divisionResult);

    }
}
