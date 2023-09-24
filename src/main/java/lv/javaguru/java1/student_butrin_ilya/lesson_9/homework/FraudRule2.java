package lv.javaguru.java1.student_butrin_ilya.lesson_9.homework;

public class FraudRule2 extends FraudRule{


    public FraudRule2(String ruleName) {
        super(ruleName);
    }
    @Override
    public boolean isFraud(Transaction t) {
        boolean rezult = true;
        if (t.getAmount() > 1000000) rezult = false;
        return rezult;

    }
}
