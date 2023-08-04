package lv.javaguru.java1.student_timur_geldiev.lesson_9.homework.day_1;

public abstract class FraudRule2 extends FraudRule{

    public FraudRule2(String ruleName){
        super(ruleName);
    }

    public boolean isMoreThanMillion(Transaction t){
        if(t.getAmount() > 1000000){
            return true;
        }
        return false;
    }

}
