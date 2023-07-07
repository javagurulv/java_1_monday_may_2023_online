package lv.javaguru.java1.student_ainars_belinskis.lesson_5.homework.day_5;

class CompoundInterestCalculatorApp {
    public static void main(String[] args) {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        System.out.println("Final deposit amount = " + compoundInterestCalculator.CompoundInterest(1000, 5, 2));
        System.out.println("Final deposit amount = " + compoundInterestCalculator.CompoundInterest(1000, 10, 2));
    }
}

