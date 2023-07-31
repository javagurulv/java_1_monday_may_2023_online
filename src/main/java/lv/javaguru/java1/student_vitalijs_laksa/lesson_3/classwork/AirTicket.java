package lv.javaguru.java1.student_vitalijs_laksa.lesson_3.classwork;

import java.util.Date;

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

