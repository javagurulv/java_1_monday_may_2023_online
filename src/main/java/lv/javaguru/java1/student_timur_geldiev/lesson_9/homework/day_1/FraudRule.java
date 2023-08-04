package lv.javaguru.java1.student_timur_geldiev.lesson_9.homework.day_1;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    abstract boolean isFraud(Transaction t);
//    public abstract boolean isMoreThanMillion();
//    public abstract boolean isSydneyTrader();

}
