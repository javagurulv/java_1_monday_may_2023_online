package lv.javaguru.java1.student_butrin_ilya.lesson_9.homework;

    abstract class FraudRule {

        private String ruleName;

        public String getRuleName() {
            return ruleName;
        }

        public FraudRule(String ruleName) {
            this.ruleName = ruleName;
        }

        public abstract boolean isFraud(Transaction t);

    }

