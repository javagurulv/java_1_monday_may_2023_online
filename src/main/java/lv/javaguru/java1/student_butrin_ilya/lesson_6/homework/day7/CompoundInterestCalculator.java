package lv.javaguru.java1.student_butrin_ilya.lesson_6.homework.day7;

class CompoundInterestCalculator {

    public double CompoundInterest(double sum,
                                   double interest,
                                   double year){
        return sum * Math.pow((1 + interest / 100), year);
    }

}
