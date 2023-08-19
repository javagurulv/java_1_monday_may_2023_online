package lv.javaguru.java1.student_timur_geldiev.lesson_11.homework.day_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekDetectorArrayVersionTest {

    @Test
    void detectDayName() {
        String expected = "Wednesday";
        DayOfTheWeekDetectorArrayVersion check = new DayOfTheWeekDetectorArrayVersion();
        String actual = check.detectDayName(3);
        assertEquals(expected, actual);
    }
}