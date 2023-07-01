package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_4;

class Pacient {

    String fullnamepacient;
    String diagnosis;
    double cost;

    public Pacient(String fullnamePacient, String diagnoz, double cost) {
        this.fullnamepacient = fullnamePacient;
        this.diagnosis = diagnoz;
        this.cost = cost;
    }

    public String getFullnamePacient() { return fullnamepacient; }
    public String getDiagnoz() { return diagnosis; }
    public double getCost() { return cost; }
}
