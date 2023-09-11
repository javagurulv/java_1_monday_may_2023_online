package lv.javaguru.java1.student_timur_geldiev.lesson_14.homework.lvl_3;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    void shouldReturnTransactionsMadeIn2011SortedFromMinToMax() {
        List<Transaction> transactionList = trans.sortTransactionsMadeInSpecifiedYearByValueFromMinToMax(2011);
        assertEquals(2, transactionList.size());
        assertEquals(300, transactionList.get(0).getValue());
        assertEquals(400, transactionList.get(1).getValue());
    }

    @Test
    void shouldReturnYearsTransactionsMade() {
        Set<Integer> transactionSet = trans.findYearsTransactionsMade();
        assertEquals(2, transactionSet.size());
        assertTrue(transactionSet.contains(2011));
        assertTrue(transactionSet.contains(2012));
    }

    @Test
    void shouldReturnAllTradersNames() {
        Set<String> traderSet = trans.findAllUniqueTradersNames();
        assertEquals(4, traderSet.size());
        assertTrue(traderSet.contains("Raoul"));
        assertTrue(traderSet.contains("Brian"));
        assertTrue(traderSet.contains("Mario"));
        assertTrue(traderSet.contains("Alan"));
    }

    @Test
    void shouldReturnAllTradersCities() {
        Set<String> traderSet = trans.findAllUniqueTradersCities();
        assertEquals(2, traderSet.size());
        assertTrue(traderSet.contains("Cambridge"));
        assertTrue(traderSet.contains("Milan"));
    }

    @Test
    void shouldReturnAllTradersFromCambridge() {
        Set<String> traderSet = trans.findAllTradesFromCambridge("Cambridge");
        assertEquals(3, traderSet.size());
        assertTrue(traderSet.contains("Raoul"));
        assertTrue(traderSet.contains("Brian"));
        assertTrue(traderSet.contains("Alan"));
    }

    @Test
    void shouldReturnTrue() {
        assertTrue(trans.isTraderInSpecifiedCity("Milan"));
        assertTrue(trans.isTraderInSpecifiedCity("Cambridge"));
    }

    @Test
    void shouldReturnMaxValue(){
        int max = trans.getMaxValue();
        assertEquals(1000, max);
    }
    @Test
    void shouldReturnMinValue(){
        Optional<Integer> min = trans.getMinValue();
        assertEquals(300, min.orElse(0));
    }
    @Test
    void shouldReturnTradersNamesSortedAlphabeticallyAndDelimitedByComma(){
        String names = trans.getAllTradersNamesSortedAlphabetically();
        assertEquals("Alan,Brian,Mario,Raoul", names);
        
    }
    @Test
    void shouldReturnTradersCitiesSortedAlphabeticallyAndDelimitedByComma(){
        String cities = trans.getAllTradersCitiesSortedAlphabetically();
        assertEquals("Cambridge,Milan", cities);

    }
}