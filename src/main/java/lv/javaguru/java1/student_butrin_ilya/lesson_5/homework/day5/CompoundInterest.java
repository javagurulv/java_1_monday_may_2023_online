package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day5;

public class CompoundInterest {
    public double calculateCompoundInterest (int startSum, int reinvestmentPeriod, int percent, int investmentPeriod){
        double sum;
        sum = startSum * Math.pow(1+(percent/ 100d / reinvestmentPeriod), reinvestmentPeriod * investmentPeriod);
        return sum;
    }
    //period * time
}
