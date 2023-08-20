package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekDetectorArrayVersionTest {

    private DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();

    @Test
    public void detectDayNameMonday() {
        String result = dayOfTheWeekDetectorArrayVersion.detectDayName(1);
        assertEquals(result, "Monday");
    }

    @Test
    public void detectDayNameTuesday() {
        String result = dayOfTheWeekDetectorArrayVersion.detectDayName(2);
        assertEquals(result, "Tuesday");
    }

    @Test
    public void detectDayNameWednesday() {
        String result = dayOfTheWeekDetectorArrayVersion.detectDayName(3);
        assertEquals(result, "Wednesday");
    }

    @Test
    public void detectDayNameThursday() {
        String result = dayOfTheWeekDetectorArrayVersion.detectDayName(4);
        assertEquals(result, "Thursday");
    }

    @Test
    public void detectDayNameFriday() {
        String result = dayOfTheWeekDetectorArrayVersion.detectDayName(5);
        assertEquals(result, "Friday");
    }

    @Test
    public void detectDayNameSaturday() {
        String result = dayOfTheWeekDetectorArrayVersion.detectDayName(6);
        assertEquals(result, "Saturday");
    }

    @Test
    public void detectDayNameSunday() {
        String result = dayOfTheWeekDetectorArrayVersion.detectDayName(7);
        assertEquals(result, "Sunday");
    }

}