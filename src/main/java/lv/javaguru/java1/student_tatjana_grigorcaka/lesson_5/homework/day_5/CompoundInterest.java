package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.homework.day_5;

//The formula for calculating compound interest is:
//A = P (1 + r/n)^(nt)
//Where:
//A = the final amount; P = the principal amount; r = the annual interest rate (as a decimal); n = the number of times the interest is compounded per year; t = the time (in years)

class CompoundInterest {
    public double calculateCompoundInterest(double principal, double rate, double year, double number) {
        double amount = principal * (Math.pow((1 + (rate / 100) / number), (year * number)));
        return amount;
    }
}



