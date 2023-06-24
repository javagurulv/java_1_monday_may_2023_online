package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day4;

import java.util.Calendar;
import java.util.Date;

public class DoctorAppointment {

    private String doctorName;
    private String doctorSpeciality;
    private Calendar date;
    private boolean isMoning;
    private boolean isDay;

    public DoctorAppointment(String doctorName, String doctorSpeciality,
                             Calendar date, boolean isMoning, boolean isDay) {
        this.doctorName = doctorName;
        this. doctorSpeciality = doctorSpeciality;
        this.date = date;
        this.isMoning = isMoning;
        this.isDay = isDay;
    }
    public String getDoctorName() {
        return doctorName;
    }
    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }
    public Calendar getDate() {
        return date;
    }
    public boolean getIsMoning() {
        return isMoning;
    }
    public boolean getIsDay() {
        return isDay;
    }
}



