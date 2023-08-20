package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekDetectorSwitchVersionTest {

    private DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();

    @Test
    public void detectDayNameMonday() {
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(1);
        assertEquals(result, "Monday");
    }

    @Test
    public void detectDayNameTuesday() {
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(2);
        assertEquals(result, "Tuesday");
    }

    @Test
    public void detectDayNameWednesday() {
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(3);
        assertEquals(result, "Wednesday");
    }

    @Test
    public void detectDayNameThursday() {
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(4);
        assertEquals(result, "Thursday");
    }

    @Test
    public void detectDayNameFriday() {
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(5);
        assertEquals(result, "Friday");
    }

    @Test
    public void detectDayNameSaturday() {
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(6);
        assertEquals(result, "Saturday");
    }

    @Test
    public void detectDayNameSunday() {
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(7);
        assertEquals(result, "Sunday");
    }

}