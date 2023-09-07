package lv.javaguru.java1.student_timur_geldiev.lesson_14.homework.lvl_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
}
