package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_9.homework;

class FraudDetector {

    boolean isFraudByNamePokemon(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon"))
            return true;
        return false;
    }

    boolean isFraudByAmountMoreThanMillion(Transaction t) {
        if (t.getAmount() > 1000000)
            return true;
        return false;
    }

    boolean isFraudByCitySydney(Transaction t) {
        if (t.getTrader().getCity().equals("Sydney"))
            return true;
        return false;
    }

    boolean isFraudByCountryJamaica(Transaction t) {
        if (t.getTrader().getCountry().equals("Jamaica"))
            return true;
        return false;
    }

    boolean isFraudByCountryGermanyAndAmountMoreThanThousand(Transaction t) {
        if (t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000)
            return true;
        return false;
    }
}
