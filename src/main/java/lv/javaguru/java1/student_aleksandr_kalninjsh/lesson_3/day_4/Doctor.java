package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_3.day_4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Doctor {

    String docNameSurn;
    String speciality;
    LocalDate date;
    LocalTime timeOne;
    LocalTime timeTwo;

    public Doctor(String docNameSurn, String speciality, LocalDate date, LocalTime timeOne, LocalTime timeTwo) {
        this.docNameSurn = docNameSurn;
        this.speciality = speciality;
        this.date = date;
        this.timeOne = timeOne;
        this.timeTwo = timeTwo;

    }
    public String getDocNameSurn() {
        return docNameSurn;
    }
    public String getSpeciality() {
        return speciality;
    }
    public  LocalDate getDate() {
        return date;
    }
    public LocalTime getTimeOne() {
        return timeOne;
    }
    public LocalTime getTimeTwo() {
        return timeTwo;
    }





}
