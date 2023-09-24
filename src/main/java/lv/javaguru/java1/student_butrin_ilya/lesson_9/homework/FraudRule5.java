package lv.javaguru.java1.student_butrin_ilya.lesson_9.homework;

public class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        boolean rezult = true;
        if ((t.getTrader().getCity().getCountry().equals("Германия")&&t.getAmount()>1000 )) rezult = false;
        return rezult;
    }


}
