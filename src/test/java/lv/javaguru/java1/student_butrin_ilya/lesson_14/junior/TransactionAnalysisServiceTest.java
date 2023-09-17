package lv.javaguru.java1.student_butrin_ilya.lesson_14.junior;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {
    TransactionAnalysisService service = new TransactionAnalysisService();
    TransactionTestData data = new TransactionTestData();
    List<Transaction> allTransaction = data.getTransactions();

    @Test
    void transaction2011Year() {
        assertEquals(service.fingTransactianByYear(2011).size(), 2);
        assertEquals(service.fingTransactianByYear(2011).get(0).getYear(), 2011);
        assertEquals(service.fingTransactianByYear(2011).get(1).getYear(), 2011);
    }

    @Test
    void transaction2012Year() {
        assertEquals(service.fingTransactianByYear(2012).size(), 4);
        assertEquals(service.fingTransactianByYear(2012).get(0).getYear(), 2012);
        assertEquals(service.fingTransactianByYear(2012).get(1).getYear(), 2012);
        assertEquals(service.fingTransactianByYear(2012).get(2).getYear(), 2012);
        assertEquals(service.fingTransactianByYear(2012).get(3).getYear(), 2012);
    }

    @Test
    void transaction2013Year() {
        assertEquals(service.fingTransactianByYear(2013).size(), 0);
    }

    @Test
    void sortTransactionByValueLow() {
        List<Transaction> sortByValue = service.sortByValueFromLow(allTransaction);
        assertEquals(sortByValue.size(), 6);
        assertEquals(sortByValue.get(0).getValue(), 300);
        assertEquals(sortByValue.get(5).getValue(), 1000);
    }

    @Test
    void sortTransactionByValueHigt() {
        List<Transaction> sortByValue = service.sortByValueFromHigh(allTransaction);
        assertEquals(sortByValue.size(), 6);
        assertEquals(sortByValue.get(0).getValue(), 1000);
        assertEquals(sortByValue.get(5).getValue(), 300);
    }

    @Test
    void findByYearAndSort() {
        List<Transaction> sortByValue = service.findAllYearTransactionAndsSortByValueFromLow(allTransaction, 2012);
        assertEquals(sortByValue.size(), 4);
        assertEquals(sortByValue.get(0).getValue(), 700);
        assertEquals(sortByValue.get(3).getValue(), 1000);
    }

    @Test
    void findallYear() {
        List<Integer> allYears = service.findAllYears(allTransaction);
        assertEquals(allYears.size(), 6);
    }
    @Test
    void findUnicalYear() {
        List<Integer> allYears = service.findUnicalYears(allTransaction);
        assertEquals(allYears.size(), 2);
    }
    @Test
    void findUnicalTraideName() {
        List<String> tradersNames = service.findNameTrander(allTransaction);
        assertEquals(tradersNames.size(), 4);
    }
    @Test
    void findCity() {
        List<String> tradersCity = service.findCityTrander(allTransaction);
        assertEquals(tradersCity.size(), 2);
    }
    @Test
    void iSCityHaveTraders(){
        assertTrue( service.isCityHaveTrader(allTransaction, "Milan"));
    }

    @Test
    void maxValue() {
        assertEquals(service.maxValue(allTransaction).get(), 1000);
    }

    }
