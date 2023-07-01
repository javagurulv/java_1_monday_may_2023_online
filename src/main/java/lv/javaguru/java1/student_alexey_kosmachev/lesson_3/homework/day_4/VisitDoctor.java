package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_4;

import java.time.LocalDate;
import java.time.LocalTime;


class VisitDoctor {

    String fullname;
    String proffesion;
    LocalDate date;
    LocalTime timeMorning10;
    LocalTime timeMorning12;
    LocalTime timeAfternoon14;
    LocalTime timeAfternoon16;

    public VisitDoctor(String fullname, String proffesion, LocalDate date, LocalTime timeMorning10, LocalTime timeMorning12, LocalTime timeAfternoon14, LocalTime timeAfternoon16) {
        this.fullname = fullname;
        this.proffesion = proffesion;
        this.date = date;
        this.timeMorning10 = timeMorning10;
        this.timeMorning12 = timeMorning12;
        this.timeAfternoon14 = timeAfternoon14;
        this.timeAfternoon16 = timeAfternoon16;
    }

    public String getFullname() { return fullname; }
    public String getProffesion() { return proffesion; }
    public LocalDate getDate() { return date; }
    public LocalTime getTimeMorning10() { return timeMorning10; }
    public LocalTime getTimeMorning12() { return timeMorning12; }
    public LocalTime getTimeAfternoon14() { return timeAfternoon14; }
    public LocalTime getTimeAfternoon16() { return timeAfternoon16; }

}
