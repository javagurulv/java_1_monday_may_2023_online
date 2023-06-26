package lv.javaguru.java1.student_butrin_ilya.lesson_3.classwork;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AirTicket {
    String start;
    String finish;
   Date timeDateStart;
Date timeDateFinish;

    public AirTicket(String start, String finish, Date timeDateStart, Date timeDateFinish) {
        this.start = start;
        this.finish = finish;
        this.timeDateStart = timeDateStart;
        this.timeDateFinish = timeDateFinish;
    }

    public String getStart() {
        return start;
    }

    public String getFinish() {
        return finish;
    }

    public Date getTimeDateStart() {

        return timeDateStart;
    }

    public Date getTimeDateFinish() {
        return timeDateFinish;
    }
}

