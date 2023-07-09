package lv.javaguru.java1.student_ainars_belinskis.lesson_5.homework.day_5;


//S = S0 × (1 + P / 100)n, где S — финальная сумма вклада S0 — начальная сумма вклада
// P — процентная ставка с учетом капитализации n — количество периодов, в которые банк начисляет проценты.
class CompoundInterestCalculator {
    public double CompoundInterest(double sum, double interest, double year){
                return  sum * Math.pow((1 + interest / 100), year);
    }
}

