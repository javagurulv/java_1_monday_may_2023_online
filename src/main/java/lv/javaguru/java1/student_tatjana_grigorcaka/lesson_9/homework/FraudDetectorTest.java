package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_9.homework;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.testIsFraudByNamePokemonTrue();
        test.testIsFraudByNameMinionFalse();
        test.testIsFraudByAmountMoreThanMillionTrue();
        test.testIsFraudByAmountMillionFalse();
        test.testIsFraudByCitySydneyTrue();
        test.testIsFraudByCityNewYorkFalse();
        test.testIsFraudByCountryJamaicaTrue();
        test.testIsFraudByCountryGermanyAndAmountMoreThanThousandTrue();
    }

    public void testIsFraudByNamePokemonTrue() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("Pokemon", "United States", "Los Angeles");
        Transaction transaction1 = new Transaction(trader1,5000);
        boolean result = fraudDetector.isFraudByNamePokemon(transaction1);
        checkResult(result, true, "testIsFraudByNamePokemonTrue");
    }

    public void testIsFraudByNameMinionFalse() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("Minion", "United States", "Los Angeles");
        Transaction transaction1 = new Transaction(trader1,5000);
        boolean result = fraudDetector.isFraudByNamePokemon(transaction1);
        checkResult(result, false, "testIsFraudByNameMinionFalse");
    }

    public void testIsFraudByAmountMoreThanMillionTrue() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("Minion", "United States", "Los Angeles");
        Transaction transaction1 = new Transaction(trader1,1000001);
        boolean result = fraudDetector.isFraudByAmountMoreThanMillion(transaction1);
        checkResult(result, true, "testIsFraudByAmountMoreThanMillionTrue");
    }

    public void testIsFraudByAmountMillionFalse() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("Minion", "United States", "Los Angeles");
        Transaction transaction1 = new Transaction(trader1,1000000);
        boolean result = fraudDetector.isFraudByAmountMoreThanMillion(transaction1);
        checkResult(result, false, "testIsFraudByAmountMillionFalse");
    }

    public void testIsFraudByCitySydneyTrue() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("Minion", "Road", "Sydney");
        Transaction transaction1 = new Transaction(trader1,500);
        boolean result = fraudDetector.isFraudByCitySydney(transaction1);
        checkResult(result, true, "testIsFraudByCitySydneyTrue");
    }

    public void testIsFraudByCityNewYorkFalse() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("Minion", "United States", "New York");
        Transaction transaction1 = new Transaction(trader1,500);
        boolean result = fraudDetector.isFraudByCitySydney(transaction1);
        checkResult(result, false, "testIsFraudByCityNewYorkFalse");
    }

    public void testIsFraudByCountryJamaicaTrue() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("Minion", "Jamaica", "Kingston");
        Transaction transaction1 = new Transaction(trader1,500);
        boolean result = fraudDetector.isFraudByCountryJamaica(transaction1);
        checkResult(result, true, "testIsFraudByCountryJamaicaTrue");
    }

    public void testIsFraudByCountryGermanyAndAmountMoreThanThousandTrue() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("Minion", "Germany","Berlin");
        Transaction transaction1 = new Transaction(trader1,1001);
        boolean result = fraudDetector.isFraudByCountryGermanyAndAmountMoreThanThousand(transaction1);
        checkResult(result, true, "testIsFraudByCityGermanyAndAmountMoreThanThousandTrue");
    }

        private void checkResult(boolean realResult,
                                boolean expectedResult,
                                String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}


