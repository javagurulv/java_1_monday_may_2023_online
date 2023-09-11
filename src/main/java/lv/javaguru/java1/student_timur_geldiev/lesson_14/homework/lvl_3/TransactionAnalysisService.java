package lv.javaguru.java1.student_timur_geldiev.lesson_14.homework.lvl_3;

import java.util.*;
import java.util.stream.Collectors;

class TransactionAnalysisService {


    public List<Transaction> getAllTransactions() {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));
        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        transactions.add(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300));
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 710));
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 700));
        transactions.add(new Transaction(new Trader("Alan", "Cambridge"), 2012, 950));
        return transactions;
    }


    public List<Transaction> findTransactionsByYear(int year) {
        return getAllTransactions().stream().filter(transaction -> transaction.getYear() == year).collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValueFromMinToMax() {
        return getAllTransactions().stream().sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValueFromMaxToMin() {
        return getAllTransactions().stream().sorted(Comparator.comparing(Transaction::getValue).reversed()).collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsMadeInSpecifiedYearByValueFromMinToMax(int year) {
        return getAllTransactions().stream().filter(transaction -> transaction.getYear() == year).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());

    }
    public Set<Integer> findYearsTransactionsMade(){
        return getAllTransactions().stream().map(Transaction::getYear).collect(Collectors.toSet());
    }
    public Set<String> findAllUniqueTradersNames(){
        return getAllTransactions().stream().map(Trader -> Trader.getTrader().getName()).collect(Collectors.toSet());
    }
    public Set<String> findAllUniqueTradersCities(){
        return getAllTransactions().stream().map(Trader -> Trader.getTrader().getCity()).collect(Collectors.toSet());
    }
    public Set<String> findAllTradesFromCambridge(String city){
        return getAllTransactions().stream().filter(Trader -> Trader.getTrader().getCity().equals(city)).map(transaction -> transaction.getTrader().getName()).collect(Collectors.toSet());
    }
    public boolean isTraderInSpecifiedCity(String city){
        return getAllTransactions().stream().anyMatch(Trader -> Trader.getTrader().getCity().equals(city));
    }

    public int getMaxValue(){
        return getAllTransactions().stream().map(Transaction::getValue).max(Integer::compareTo).orElse(0);
    }
    public Optional<Integer> getMinValue(){
        return getAllTransactions().stream().map(Transaction::getValue).min(Integer::compareTo);
    }
    public String getAllTradersNamesSortedAlphabetically(){
        return getAllTransactions().stream().map(transaction -> transaction.getTrader().getName()).distinct().sorted().collect(Collectors.joining(","));
    }
    public String getAllTradersCitiesSortedAlphabetically(){
        return getAllTransactions().stream().map(transaction -> transaction.getTrader().getCity()).distinct().sorted().collect(Collectors.joining(","));
    }
}
