package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_9;

class FraudDetector {

    boolean traderPokemonIsFraud(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }

    boolean transactionsMoreThanMillion(Transaction t) {
        if (t.getAmount() < 1000000) {
            return true;
        }
        return false;
    }

    boolean tradersTransactionsFromSydneyCity(Transaction t) {
        if (t.getTrader().getCity().equals("Sydney")) {
            return true;
        }
        return false;
    }

    boolean tradersTransactionsFromTheCountryJamaica(Transaction t) {
        if (t.getTrader().getCountry().equals("Jamaica")) {
            return true;
        }
        return false;
    }

    boolean tradersTransactionsFromGermany(Transaction t) {
        if (t.getTrader().getCountry().equals("Germany") && (t.getAmount() > 1000)) {
            return true;
        }
        return false;
    }

}
