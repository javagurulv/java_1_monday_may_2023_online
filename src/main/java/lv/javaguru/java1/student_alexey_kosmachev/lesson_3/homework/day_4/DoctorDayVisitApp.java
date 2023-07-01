package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_4;

import lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.homework.day_4.DoctorVisit;

import java.time.LocalDate;
import java.time.LocalTime;

class DoctorDayVisitApp {
    public static void main(String[] args) {

        LocalTime TimeMorning10 = LocalTime.of(10, 00);
        LocalTime TimeMorning12 = LocalTime.of(12, 00);
        LocalTime TimeAfternoon14  = LocalTime.of(14, 00);
        LocalTime TimeAfternoon16 = LocalTime.of(16, 00);

        Pacient Pacient1 = new Pacient("Pavlik Morozov", "Get a cold", 10.25);
        LocalDate Date1 = LocalDate.of(2023,06,30);
        VisitDoctor Doctor = new VisitDoctor("Vija Babicka", "Terapeut", Date1, TimeMorning10, TimeMorning12, TimeAfternoon14, TimeAfternoon16 );

        Pacient Pacient2 = new Pacient("Nadezda Babkina", "broken finger", 15.10);
        LocalDate Date2 = LocalDate.of(2023,07,05);
        VisitDoctor Doctor2 = new VisitDoctor("Petja Vasechkin", "surgeon", Date2, TimeMorning10, TimeMorning12, TimeAfternoon14, TimeAfternoon16 );

        System.out.println("Visit Card number1: " );
        System.out.println("Pacient Name: " + Pacient1.getFullnamePacient());
        System.out.println("Your Diagnoz: " + Pacient1.getDiagnoz());
        System.out.println("Date of Visit: " + Date1);
        System.out.println("Time of Visit: " + "From " + TimeMorning10 + " to " + TimeMorning12);
        System.out.println("Your Doctor: " + Doctor.getFullname());
        System.out.println("Your Doctor Proffesion: " + Doctor.getProffesion());
        System.out.println("Price of Visit: " + Pacient1.getCost());

        System.out.println();

        System.out.println("Visit Card number2: " );
        System.out.println("Pacient Name: " + Pacient2.getFullnamePacient());
        System.out.println("Your Diagnoz: " + Pacient2.getDiagnoz());
        System.out.println("Date of Visit: " + Date2);
        System.out.println("Time of Visit: " + "From " + TimeAfternoon14 + " to " + TimeAfternoon16);
        System.out.println("Your Doctor: " + Doctor2.getFullname());
        System.out.println("Your Doctor Proffesion: " + Doctor2.getProffesion());
        System.out.println("Price of Visit: " + Pacient2.getCost());





    }
}
