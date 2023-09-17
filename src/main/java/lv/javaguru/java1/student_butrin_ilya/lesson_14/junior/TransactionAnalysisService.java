package lv.javaguru.java1.student_butrin_ilya.lesson_14.junior;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TransactionAnalysisService {

    public List<Transaction> fingTransactianByYear(int year) {
        TransactionTestData data = new TransactionTestData();
        List<Transaction> allTransactions = data.getTransactions();
        List<Transaction> TransactionOnlyYear = allTransactions.stream()
                .filter(transaction -> transaction.getYear() == year).collect(Collectors.toList());
        return TransactionOnlyYear;
    }

    public List<Transaction> sortByValueFromLow(List<Transaction> transactions) {
        List<Transaction> sortByValueList = transactions.stream().sorted((o1, o2) -> Integer.compare(o1.getValue(), o2.getValue())).collect(Collectors.toList());
        return sortByValueList;
    }

    public List<Transaction> sortByValueFromHigh(List<Transaction> transactions) {
        List<Transaction> sortByValueList = transactions.stream().sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue())).collect(Collectors.toList());
        return sortByValueList;
    }

    public List<Transaction> findAllYearTransactionAndsSortByValueFromLow(List<Transaction> transactions, int year) {
        List<Transaction> allYearTransactionAndsSortByValueFromLow = transactions.stream()
                .filter(transaction -> transaction.getYear() == year).sorted((o1, o2) -> Integer.compare(o1.getValue(), o2.getValue())).collect(Collectors.toList());
        return allYearTransactionAndsSortByValueFromLow;
    }

    public List<Integer> findAllYears(List<Transaction> allTransactions) {
        List<Integer> allYears = allTransactions.stream().map(allTransaction -> allTransaction.getYear())
                .collect(Collectors.toList());
        return allYears;
    }

    public List<Integer> findUnicalYears(List<Transaction> allTransactions) {
        List<Integer> allYears = allTransactions.stream().map(allTransaction -> allTransaction.getYear()).distinct()
                .collect(Collectors.toList());
        return allYears;
    }

    public List<String> findNameTrander(List<Transaction> allTransactions) {
        List<String> allTraidarNames = allTransactions.stream().map(allTransaction -> allTransaction.getTrader().getName()).distinct()
                .collect(Collectors.toList());
        return allTraidarNames;
    }

    public List<String> findCityTrander(List<Transaction> allTransactions) {
        List<String> allCity = allTransactions.stream().map(allTransaction -> allTransaction.getTrader().getCity()).distinct()
                .collect(Collectors.toList());
        return allCity;
    }

    public List<String> findCityTrander(List<Transaction> allTransactions, String city) {
        List<String> CityTrander = allTransactions.stream().filter(transactions -> transactions.getTrader().getCity()
                        .equals(city)).map(allTransaction -> allTransaction.getTrader().getName()).distinct()
                .collect(Collectors.toList());
        return CityTrander;
    }

    public boolean isCityHaveTrader(List<Transaction> transaction, String city) {
        boolean isCityHaveTrader = transaction.stream().anyMatch(transaction1 -> transaction1.getTrader().getCity().equals(city));

        return isCityHaveTrader;
    }

    public Optional<Integer> maxValue(List<Transaction> transactions) {

        return transactions.stream()
                .map(transaction -> transaction.getValue())
                .max((a1, a2) -> Integer.compare(a1, a2));

    }

    public Optional<Integer> minValue(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getValue())
                .min((a, b) -> Integer.compare(a, b));
    }

    public String getAllNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .sorted().distinct().collect(Collectors.joining(","));

    }
    public String getAllCity(List<Transaction> transactions) {
        return transactions.stream().map(transaction -> transaction.getTrader().getCity())
                .distinct().sorted(Comparator.reverseOrder()).collect(Collectors.joining(","));
    }
}