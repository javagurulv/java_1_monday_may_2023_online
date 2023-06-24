package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.homework.day_4;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class DoctorVisit {

    private String name;
    private String speciality;
    private LocalDate appointmentDate;
    private LocalTime appTimeFromOne;
    private LocalTime  appTimeFromTwo;

    private LocalTime appTimeToOne;
    private LocalTime  appTimeToTwo;


    public DoctorVisit(String name, String speciality, LocalDate appointmentDate, LocalTime appTimeFromOne, LocalTime appTimeToOne, LocalTime appTimeFromTwo, LocalTime  appTimeToTwo) {
        this.name = name;
        this.speciality = speciality;
        this.appointmentDate = appointmentDate;
        this.appTimeFromOne = appTimeFromOne;
        this.appTimeToOne = appTimeToOne;
        this.appTimeFromTwo = appTimeFromTwo;
        this.appTimeToTwo = appTimeToTwo;
    }


    public String getName() {return name;}

    public String getSpeciality() {return speciality;}
    public LocalDate getAppointmentDate() {return appointmentDate;}
    public LocalTime getAppTimeFromOne() {return appTimeFromOne;}
    public LocalTime getAppTimeToOne() {return appTimeToOne;}
    public LocalTime getAppTimeFromTwo() {return appTimeFromTwo;}
    public LocalTime getAppTimeToTwo() {return appTimeToTwo;}

    }



