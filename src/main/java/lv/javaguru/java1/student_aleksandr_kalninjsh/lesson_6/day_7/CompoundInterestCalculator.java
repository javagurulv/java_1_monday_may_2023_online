package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_6.day_7;

class CompoundInterestCalculator {

    public double compoundInterest(double sum,
                                   double interest,
                                   double year){
        return sum * Math.pow((1 + interest / 100), year);
    }
}
