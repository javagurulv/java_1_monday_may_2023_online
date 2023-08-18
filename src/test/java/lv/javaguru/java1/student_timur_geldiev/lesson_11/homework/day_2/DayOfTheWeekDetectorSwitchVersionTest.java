package lv.javaguru.java1.student_timur_geldiev.lesson_11.homework.day_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekDetectorSwitchVersionTest {

    @Test
    void detectDayName() {
        String expected = "Tuesday";
        DayOfTheWeekDetectorSwitchVersion check = new DayOfTheWeekDetectorSwitchVersion();
        String actual = check.detectDayName(2);
        assertEquals(expected, actual);
    }
}