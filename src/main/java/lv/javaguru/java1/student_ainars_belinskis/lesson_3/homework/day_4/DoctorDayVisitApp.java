package lv.javaguru.java1.student_ainars_belinskis.lesson_3.homework.day_4;

class DoctorDayVisitApp {
    public static void main(String[] args) {
        CalendarDay docOne = new CalendarDay(20, 07, 2023);
        CalendarDay docTwo = new CalendarDay(23, 07, 2023);
        Appointment appDocOne = new Appointment("10:00", "12:00");
        Appointment appDocTwo = new Appointment("14:00", "16:00");
        Pacient pacOne = new Pacient("Bob Duglas", "ORZ", 55);
        Pacient pacTwo = new Pacient("Antonio Bernard", "Skleroz", 77);

        Doctor doctorOne = new Doctor("Zigmund Frenk", "Terapevt", docOne, appDocOne,appDocTwo);

        System.out.println(doctorOne.getDocNameSurname());
        System.out.println(doctorOne.getSpecialty());
        docOne.dayMonYer();
        appDocOne.timePeriod();
        System.out.println(pacOne.getPacNameSurn());
        System.out.println(pacOne.getDiagnosis());
        System.out.println(pacOne.getCost());
        System.out.println("");
        System.out.println(doctorOne.getDocNameSurname());
        System.out.println(doctorOne.getSpecialty());
        docTwo.dayMonYer();
        appDocTwo.timePeriod();
        System.out.println(pacTwo.getPacNameSurn());
        System.out.println(pacTwo.getDiagnosis());
        System.out.println(pacTwo.getCost());

    }
}
