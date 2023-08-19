package lv.javaguru.java1.student_butrin_ilya.lesson_11.day2;

import lv.javaguru.java1.student_butrin_ilya.lesson_11.day2.task1.DayOfTheWeekDetectorWitchVersion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekDetectorWitchVersionTest {
    @Test
    public void testSwichVersionMondey() {
        DayOfTheWeekDetectorWitchVersion test = new DayOfTheWeekDetectorWitchVersion();
        String realrezult = "Mondey";
        String expected = test.detectDayName(1);
        assertEquals(expected, realrezult);
    }

    @Test
    public void testSwichVersionFriday() {
        DayOfTheWeekDetectorWitchVersion test = new DayOfTheWeekDetectorWitchVersion();
        String realrezult = "Friday";
        String expected = test.detectDayName(5);
        assertEquals(expected, realrezult);

    }
}