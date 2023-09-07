package lv.javaguru.java1.student_timur_geldiev.lesson_14.homework.lvl_3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {

    private TransactionAnalysisService trans = new TransactionAnalysisService();

    @Test
    void shouldReturnTransactionWithYear2011() {
        List<Transaction> transactionList = trans.findTransactionsByYear(2011);
        assertEquals(2, transactionList.size());
        assertEquals(2011, transactionList.get(0).getYear());
        assertEquals(2011, transactionList.get(1).getYear());
    }

    @Test
    void shouldReturnTransactionsSortedByValueFromMinToMax() {
        List<Transaction> transactionList = trans.sortTransactionsByValueFromMinToMax();
        assertEquals(300, transactionList.get(0).getValue());
        assertEquals(400, transactionList.get(1).getValue());
        assertEquals(700, transactionList.get(2).getValue());
        assertEquals(710, transactionList.get(3).getValue());
        assertEquals(950, transactionList.get(4).getValue());
        assertEquals(1000, transactionList.get(5).getValue());
    }

    @Test
    void shouldReturnTransactionsSortedByValueFromMaxToMin() {
        List<Transaction> transactionList = trans.sortTransactionsByValueFromMaxToMin();
        assertEquals(1000, transactionList.get(0).getValue());
        assertEquals(950, transactionList.get(1).getValue());
        assertEquals(710, transactionList.get(2).getValue());
        assertEquals(700, transactionList.get(3).getValue());
        assertEquals(400, transactionList.get(4).getValue());
        assertEquals(300, transactionList.get(5).getValue());
    }

    @Test
    void shouldReturnTransactionsMadeIn2011SortedFromMinToMax(){
        List<Transaction> transactionList = trans.sortTransactionsMadeInSpecifiedYearByValueFromMinToMax(2011);
        assertEquals(2, transactionList.size());
        assertEquals(300, transactionList.get(0).getValue());
        assertEquals(400, transactionList.get(1).getValue());
    }
}