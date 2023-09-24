package lv.javaguru.java1.student_butrin_ilya.lesson_9.homework;

    class FraudRule1 extends FraudRule {

        public FraudRule1(String ruleName) {
            super(ruleName);
        }

        public boolean isFraud(Transaction t) {
            boolean rezult = true;
            if (t.getTrader().getFullName().equals("Pokemon")) rezult = false;
            return rezult;
        }

    }


