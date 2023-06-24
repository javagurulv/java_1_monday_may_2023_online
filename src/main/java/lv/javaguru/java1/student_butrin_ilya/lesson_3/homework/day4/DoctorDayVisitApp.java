package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day4;

import java.util.Calendar;
import java.util.GregorianCalendar;

class DoctorDayVisitApp {
    public static void main(String[] args) {
        Calendar andreyDate = new GregorianCalendar(2022, 0, 25);
        Calendar ilyaDate = new GregorianCalendar(2022, 1, 25);

        DoctorAppointment andrey = new DoctorAppointment("Alina Soboleva", "nevrolog", andreyDate, true, false);
        DoctorAppointment ilya = new DoctorAppointment("Olga Dudareva", "magic gerl", ilyaDate, true, false);

        Patient andreyI = new Patient("Andrey Ivanov", "lcp", 5000, andrey);
        Patient ilyaB = new Patient("ilya Butrin", "mistic disiase", 300, ilya);


        System.out.println("patient name: " + andreyI.getPatientName() + "\nDiagnosis: " + andreyI.getDiagnosis() + "\nPrice: " + andreyI.getPrice());
        System.out.println("Doctor name: " + andrey.getDoctorName() + "\nDoctor speciality: " + andrey.getDoctorSpeciality() + "\nDate: " + andreyDate.getTime());
        System.out.println("Morning? " + andrey.getIsMoning() + "\nDay? " + andrey.getIsDay());
        System.out.println();
        System.out.println("patient name: " + ilyaB.getPatientName() + "\nDiagnosis: " + ilyaB.getDiagnosis() + "\nPrice: " + ilyaB.getPrice());
        System.out.println("Doctor name: " + ilya.getDoctorName() + "\nDoctor speciality: " + ilya.getDoctorSpeciality() + "\nDate: " + ilyaDate.getTime());
        System.out.println("Morning? " + ilya.getIsMoning() + "\nDay? " + ilya.getIsDay());
    }
}
