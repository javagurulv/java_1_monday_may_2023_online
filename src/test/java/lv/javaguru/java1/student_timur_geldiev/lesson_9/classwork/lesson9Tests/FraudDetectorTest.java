package lv.javaguru.java1.student_timur_geldiev.lesson_9.classwork.lesson9Tests;

import lv.javaguru.java1.student_timur_geldiev.lesson_9.homework.day_1.CountryRejection;
import lv.javaguru.java1.student_timur_geldiev.lesson_9.homework.day_1.Trader;
import lv.javaguru.java1.student_timur_geldiev.lesson_9.homework.day_1.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FraudDetectorTest {

    @Test
    public void checkTraderFromSydneyRejected() {
        boolean expected = true;
        Trader trader = new Trader("SuperNotScamTrader", "Fairland", "NotScammington");
        Transaction t1 = new Transaction(trader, 10000);
        CountryRejection detector = new CountryRejection();
        boolean actual = detector.isSydneyTrader(t1);
        //assertEquals(expected, actual);
    }

}
