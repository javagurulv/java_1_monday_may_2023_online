package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

class VisitDoctor {

    String fullname;
    String proffesion;
    LocalDate Date;
    LocalTime TimeMorning10;
    LocalTime TimeMorning12;
    LocalTime TimeAfternoon14;
    LocalTime TimeAfternoon16;

    public VisitDoctor(String fullname, String proffesion, LocalDate date, LocalTime timeMorning10, LocalTime timeMorning12, LocalTime timeAfternoon14, LocalTime timeAfternoon16) {
        this.fullname = fullname;
        this.proffesion = proffesion;
        Date = date;
        TimeMorning10 = timeMorning10;
        TimeMorning12 = timeMorning12;
        TimeAfternoon14 = timeAfternoon14;
        TimeAfternoon16 = timeAfternoon16;
    }

    public String getFullname() { return fullname; }
    public String getProffesion() { return proffesion; }
    public LocalDate getDate() { return Date; }
    public LocalTime getTimeMorning10() { return TimeMorning10; }
    public LocalTime getTimeMorning12() { return TimeMorning12; }
    public LocalTime getTimeAfternoon14() { return TimeAfternoon14; }
    public LocalTime getTimeAfternoon16() { return TimeAfternoon16; }

}
