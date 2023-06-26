package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.homework.day_4;

import java.time.LocalDate;
import java.time.LocalTime;

public class DocDayVisitApp {

        public static void main(String[] args) {

                LocalTime appointmentTimeFromOne = LocalTime.of(10, 00);
                LocalTime appointmentTimeToOne = LocalTime.of(12, 00);
                LocalTime appointmentTimeFromTwo  = LocalTime.of(14, 00);
                LocalTime appointmentTimeToTwo = LocalTime.of(16, 00);

                Patient patientRegistrationCardOne = new Patient("Mr Daniel Johnson", "Broken hand", "100");
                LocalDate appointmentDateOne = LocalDate.of(2023, 06, 25);
                DoctorVisit doctorVisitOne = new DoctorVisit("Mr Jonathan Elis", "surgeon", appointmentDateOne, appointmentTimeFromOne, appointmentTimeToOne, appointmentTimeFromTwo, appointmentTimeToTwo);

                Patient patientRegistrationCardTwo = new Patient("Ms Emily Daniel", "Heart ache", "50");
                LocalDate appointmentDateTwo = LocalDate.of(2023, 07, 10);
                DoctorVisit doctorVisitTwo = new DoctorVisit("Mr Peter Bim ", "cardiologist", appointmentDateTwo, appointmentTimeFromOne, appointmentTimeToOne, appointmentTimeFromTwo, appointmentTimeToTwo);



                System.out.println("Visit: 1");
                System.out.println("Doctor 1: ");
                System.out.println(doctorVisitOne.getName());
                System.out.println(doctorVisitOne.getSpeciality());
                System.out.println(appointmentDateOne);
                System.out.println("Visit Time 1: " + appointmentTimeFromOne + " - " + appointmentTimeToOne);
                System.out.println("Patient 1: ");
                System.out.println(patientRegistrationCardOne.getFirstNameLastName());
                System.out.println(patientRegistrationCardOne.getDiagnose());
                System.out.println(patientRegistrationCardOne.getPrice());


                System.out.println("Visit: 2");
                System.out.println("Doctor 2: ");
                System.out.println(doctorVisitTwo.getName());
                System.out.println(doctorVisitTwo.getSpeciality());
                System.out.println(appointmentDateTwo);
                System.out.println("Visit Time 2: " + appointmentTimeFromTwo + " - " +  appointmentTimeToTwo);
                System.out.println("Patient 2: ");
                System.out.println(patientRegistrationCardTwo.getFirstNameLastName());
                System.out.println(patientRegistrationCardTwo.getDiagnose());
                System.out.println(patientRegistrationCardTwo.getPrice());


        }
        }





