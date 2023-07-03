package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_3.day_4;

import java.time.LocalDate;
import java.time.LocalTime;

public class DoctorDayVisitApp {

    public static void main(String[] args) {

        LocalTime timeOne = LocalTime.of(10, 12);
        LocalTime timeTwo = LocalTime.of(14, 16);

        LocalDate date1 = LocalDate.of(2021, 05, 11);
        Doctor doctor1 = new Doctor("Ekaterina Efimova", "Dentist", date1, timeOne, timeTwo);
        Patient patient1 = new Patient("Sergei Smoljaninov", "Bad tooth", 150);

        System.out.println("Doctor 1");
        System.out.println(doctor1.getDocNameSurn());
        System.out.println(doctor1.getSpeciality());
        System.out.println(doctor1.getDate());
        System.out.println(doctor1.timeOne);
        System.out.println(doctor1.timeTwo);
        System.out.println("Patient 1");
        System.out.println(patient1.getPatNameSurn());
        System.out.println(patient1.getDiagnosis());
        System.out.println(patient1.getVisitCost() + " eur ");

        LocalDate date2 = LocalDate.of(2020, 02, 17);
        Doctor doctor2 = new Doctor("Evgenij Afanasjev", "Neuropathologist", date2, timeOne, timeTwo);
        Patient patient2 = new Patient("Andrej Sviridov", "Insomnia", 350);

        System.out.println("Doctor 2");
        System.out.println(doctor2.getDocNameSurn());
        System.out.println(doctor2.getSpeciality());
        System.out.println(doctor2.getDate());
        System.out.println(doctor2.timeOne);
        System.out.println(doctor1.timeTwo);
        System.out.println("Patient 2");
        System.out.println(patient2.getPatNameSurn());
        System.out.println(patient2.getDiagnosis());
        System.out.println(patient2.getVisitCost() + " eur ");





    }
}
