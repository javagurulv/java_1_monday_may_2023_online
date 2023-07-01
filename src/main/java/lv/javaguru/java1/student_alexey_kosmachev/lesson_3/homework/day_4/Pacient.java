package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_4;

class Pacient {

    String FullnamePacient;
    String Diagnoz;
    double Cost;

    public Pacient(String fullnamePacient, String diagnoz, double cost) {
        FullnamePacient = fullnamePacient;
        Diagnoz = diagnoz;
        Cost = cost;
    }

    public String getFullnamePacient() { return FullnamePacient; }
    public String getDiagnoz() { return Diagnoz; }
    public double getCost() { return Cost; }
}
