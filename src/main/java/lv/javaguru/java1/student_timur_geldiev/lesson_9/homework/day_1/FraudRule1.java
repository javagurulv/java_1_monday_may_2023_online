package lv.javaguru.java1.student_timur_geldiev.lesson_9.homework.day_1;

public class FraudRule1 extends FraudRule{

    private Transaction t;

    public FraudRule1(String ruleName){
        super(ruleName);
    }

    @Override
    boolean isFraud(Transaction t){
        if(t.getTrader().getFullName().equals("Pokemon")){
            return true;
        }
        return false;
    }

}
