package lv.javaguru.java1.student_timur_geldiev.lesson_3.homework.day4;

import java.sql.Time;
import java.time.LocalDate;

class DoctorDayVisitApp {
    public static void main(String[] args) {
        Registration ticket1 = new Registration("John Smith", "Flu", 199.99);
        LocalDate appointmentDate1 = LocalDate.of(2024, 5, 12);
        Time firstOptionTime = new Time(12, 00,00);
        Time secondOptionTime = new Time(14, 30, 00);
        RegToDoc appointment1 = new RegToDoc("Smith Johnson", "Therapist", appointmentDate1, firstOptionTime, secondOptionTime);

        Registration ticket2 = new Registration("Palmer White", "Toothpain", 500);
        LocalDate appointmentDate2 = LocalDate.of(2023, 6, 25);
        Time firstOptionTime2 = new Time(10, 00,00);
        Time secondOptionTime2 = new Time(15, 30, 00);
        RegToDoc appointment2 = new RegToDoc("Obam Boraka", "Dentist", appointmentDate2, firstOptionTime2, secondOptionTime2);

        System.out.println("The patient : " + ticket1.getNameLastName() + " with diagnosis : " + ticket1.getDiagnosis() + " is signed to the " + appointment1.getSpeciality() + " : " + appointment1.getDocName() + "\nat " + appointment1.getAppointmentDate() + " and he has two time options " + appointment1.getFirstOption() + " and " + appointment1.getSecondOption() + "\nThe price for the appointment is " + ticket1.getPrice() + " euro");
        System.out.println("The patient : " + ticket2.getNameLastName() + " with diagnosis : " + ticket2.getDiagnosis() + " is signed to the " + appointment2.getSpeciality() + " : " + appointment2.getDocName() + "\nat " + appointment2.getAppointmentDate() + " and he has two time options " + appointment2.getFirstOption() + " and " + appointment2.getSecondOption() + "\nThe price for the appointment is " + ticket2.getPrice() + " euro");

    }
}
