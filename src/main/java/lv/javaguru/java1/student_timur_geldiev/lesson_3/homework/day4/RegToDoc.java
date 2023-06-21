package lv.javaguru.java1.student_timur_geldiev.lesson_3.homework.day4;

import java.sql.Time;
import java.util.Date;
import java.time.LocalDate;

public class RegToDoc {

    String docName;
    String speciality;
    LocalDate appointmentDate;
    Time firstOption;
    Time secondOption;

    public RegToDoc(String docName, String speciality, LocalDate appointmentDate, Time firstOption, Time secondOption){
        this.docName = docName;
        this.speciality = speciality;
        this.appointmentDate = appointmentDate;
        this.firstOption = firstOption;
        this.secondOption = secondOption;
    }

    public String getDocName() {
        return docName;
    }

    public String getSpeciality() {
        return speciality;
    }
    public LocalDate getAppointmentDate(){
        return appointmentDate;
    }

    public Time getFirstOption() {
        return firstOption;
    }

    public Time getSecondOption() {
        return secondOption;
    }
}
