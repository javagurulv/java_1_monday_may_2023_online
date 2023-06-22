package lv.javaguru.java1.student_ainars_belinskis.lesson_3.homework.day_4;

class Doctor {
    private String docNameSurname;
    private String specialty;
    private CalendarDay dayRecording;
    private Appointment appointOne;
    private Appointment appointTwo;

    public Doctor(String docNameSurname, String specialty, CalendarDay dayRecording, Appointment appointOne, Appointment appointTwo) {
        this.docNameSurname = docNameSurname;
        this.specialty = specialty;
    }
    public String getDocNameSurname () {return docNameSurname;}
    public String getSpecialty () {return specialty;}


}
