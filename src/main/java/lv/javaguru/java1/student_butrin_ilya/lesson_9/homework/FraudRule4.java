package lv.javaguru.java1.student_butrin_ilya.lesson_9.homework;

public class FraudRule4 extends FraudRule{
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        boolean rezult = true;
     if(t.getTrader().getCity().getCountry().equals("Ямайка")) rezult = false;
     return rezult;
    }
}
