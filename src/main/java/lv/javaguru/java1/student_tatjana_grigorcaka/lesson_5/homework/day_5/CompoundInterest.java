package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.homework.day_5;

//Formula to calculate compound interest annually is given by:
//Compound Interest = P(1 + R/100)t
//Where,
//P is principal amount
//R is the rate and
//T is the time span

class CompoundInterest {
    public double calculateCompoundInterest(double principal, double rate, double year) {
        return principal * (Math.pow((1 + rate / 100), year));
    }
}



