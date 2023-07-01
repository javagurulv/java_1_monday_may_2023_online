package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_4;

import java.time.LocalDate;
import java.time.LocalTime;
class DoctorDayVisitApp {
    public static void main(String[] args) {

        LocalTime timeMorning10 = LocalTime.of(10, 00);
        LocalTime timeMorning12 = LocalTime.of(12, 00);
        LocalTime timeAfternoon14  = LocalTime.of(14, 00);
        LocalTime timeAfternoon16 = LocalTime.of(16, 00);

        Pacient pacient1 = new Pacient("Pavlik Morozov", "Get a cold", 10.25);
        LocalDate date1 = LocalDate.of(2023,06,30);
        VisitDoctor doctor = new VisitDoctor("Vija Babicka", "Terapeut", date1, timeMorning10, timeMorning12, timeAfternoon14, timeAfternoon16 );

        Pacient pacient2 = new Pacient("Nadezda Babkina", "broken finger", 15.10);
        LocalDate date2 = LocalDate.of(2023,07,05);
        VisitDoctor doctor2 = new VisitDoctor("Petja Vasechkin", "surgeon", date2, timeMorning10, timeMorning12, timeAfternoon14, timeAfternoon16 );

        System.out.println("Visit Card number1: " );
        System.out.println("Pacient Name: " + pacient1.getFullnamePacient());
        System.out.println("Your Diagnoz: " + pacient1.getDiagnoz());
        System.out.println("Date of Visit: " + date1);
        System.out.println("Time of Visit: " + "From " + timeMorning10 + " to " + timeMorning12);
        System.out.println("Your Doctor: " + doctor.getFullname());
        System.out.println("Your Doctor Proffesion: " + doctor.getProffesion());
        System.out.println("Price of Visit: " + pacient1.getCost());

        System.out.println();

        System.out.println("Visit Card number2: " );
        System.out.println("Pacient Name: " + pacient2.getFullnamePacient());
        System.out.println("Your Diagnoz: " + pacient2.getDiagnoz());
        System.out.println("Date of Visit: " + date2);
        System.out.println("Time of Visit: " + "From " + timeAfternoon14 + " to " + timeAfternoon16);
        System.out.println("Your Doctor: " + doctor2.getFullname());
        System.out.println("Your Doctor Proffesion: " + doctor2.getProffesion());
        System.out.println("Price of Visit: " + pacient2.getCost());

    }
}
