package lv.javaguru.java1.student_butrin_ilya.lesson_9.homework;

public class FraudRule3 extends FraudRule {
    @Override
    public boolean isFraud(Transaction t) {
        boolean rezult = true;
        if ( t.getTrader().getCity().getCity().equals("Сидней")) rezult = false;
        return rezult;
    }

    public FraudRule3(String ruleName) {
        super(ruleName);
    }
}
