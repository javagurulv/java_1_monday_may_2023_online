package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.workinclass;

public class AverageNumberCalculatorApp {
    public static void main(String[] args) {
        AverageNumberCalculator calculator = new AverageNumberCalculator();
        System.out.println("Average: " + calculator.findAverage(10,11));
        System.out.println("Average: " + calculator.findAverage(14,19));
        System.out.println("Average: " + calculator.findAverageDouble(5,16));
    }
}
