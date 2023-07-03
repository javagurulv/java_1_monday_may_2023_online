package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_3.day_4;

public class Patient {

    String patNameSurn;
    String diagnosis;
    double visitCost;

    public Patient(String patNameSurn, String diagnosis, double visitCost) {
        this.patNameSurn = patNameSurn;
        this.diagnosis = diagnosis;
        this.visitCost = visitCost;
    }
    public String getPatNameSurn() {
        return patNameSurn;
    }
    public String getDiagnosis() {
        return diagnosis;
    }
    public double getVisitCost() {
        return visitCost;
    }

}
