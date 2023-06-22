package lv.javaguru.java1.student_ainars_belinskis.lesson_3.homework.day_4;

public class Pacient {
    String pacNameSurn;
    String diagnosis;
    double cost;

    public Pacient(String pacNameSurn, String diagnosis, double cost) {
        this.pacNameSurn = pacNameSurn;
        this.diagnosis = diagnosis;
        this.cost = cost;
    }

    public String getPacNameSurn () {return pacNameSurn;}
    public String getDiagnosis () {return diagnosis;}
    public double getCost() {return cost;}

}
