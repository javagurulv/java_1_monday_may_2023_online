package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_9;

class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.traderPokemonIsFraud();
        fraudDetectorTest.transactionsMoreThanMillion();
        fraudDetectorTest.tradersTransactionsFromSydneyCity();
        fraudDetectorTest.tradersTransactionsFromTheCountryJamaica();
        fraudDetectorTest.tradersTransactionsFromGermany();
    }

    public void traderPokemonIsFraud() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "USA", "San Francisco");
        Transaction transaction = new Transaction(trader, 7000);
        boolean result = fraudDetector.traderPokemonIsFraud(transaction);
        checkResult(result, true, "Trader Pokemon is fraud");
    }

    public void transactionsMoreThanMillion() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Shadow", "USA", "Las Vegas");
        Transaction transaction = new Transaction(trader, 7000);
        boolean result = fraudDetector.transactionsMoreThanMillion(transaction);
        checkResult(result, true, "Transaction more than million");
    }

    public void tradersTransactionsFromSydneyCity() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Fantomas", "Australia", "Sydney");
        Transaction transaction = new Transaction(trader, 7000);
        boolean result = fraudDetector.tradersTransactionsFromSydneyCity(transaction);
        checkResult(result, false, "Traders transactions from Sydney city");
    }

    public void tradersTransactionsFromTheCountryJamaica() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Stranger", "Jamaica", "Negril");
        Transaction transaction = new Transaction(trader, 9000);
        boolean result = fraudDetector.tradersTransactionsFromTheCountryJamaica(transaction);
        checkResult(result, false, "Traders transactions from the country Jamaica");
    }

    public void tradersTransactionsFromGermany() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("No name", "Germany", "Bremen");
        Transaction transaction = new Transaction(trader, 10000);
        boolean result = fraudDetector.tradersTransactionsFromGermany(transaction);
        checkResult(result, false, "Traders transactions from Germany");
    }

    private void checkResult(boolean realResult,
                        boolean expectedResult,
                        String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + " test = OK ");
        } else {
            System.out.println(testScenarioName + " test = FAIL ");
        }
    }


}
