package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day4;

class Patient {

    private String patientName;
    private String diagnosis;
    private int price;
    private DoctorAppointment doctorAppointment;

    public Patient (String patientName, String diagnosis, int price, DoctorAppointment doctorAppointment){
        this.patientName = patientName;
        this.diagnosis = diagnosis;
        this.price = price;
        this.doctorAppointment = doctorAppointment;
    }
    public String getPatientName() {
        return patientName;
    }
    public String getDiagnosis() {
        return diagnosis;
    }
    public int getPrice() {
        return price;
    }
}
