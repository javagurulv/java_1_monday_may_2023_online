package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekDetectorIfVersionTest {

    private DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();

    @Test
    public void detectDayNameMonday() {
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(1);
        assertEquals(result, "Monday");
    }

    @Test
    public void detectDayNameTuesday() {
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(2);
        assertEquals(result, "Tuesday");
    }

    @Test
    public void detectDayNameWednesday() {
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(3);
        assertEquals(result, "Wednesday");
    }

    @Test
    public void detectDayNameThursday() {
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(4);
        assertEquals(result, "Thursday");
    }

    @Test
    public void detectDayNameFriday() {
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(5);
        assertEquals(result, "Friday");
    }

    @Test
    public void detectDayNameSaturday() {
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(6);
        assertEquals(result, "Saturday");
    }

    @Test
    public void detectDayNameSunday() {
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(7);
        assertEquals(result, "Sunday");
    }

}
